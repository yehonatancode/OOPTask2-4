package GUI;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import Coords.coordsToPixel;
import packmenAndFruits.fruits;
import packmenAndFruits.packmen;

@SuppressWarnings("serial")
public class GuiEX3 extends JFrame implements MouseListener,ActionListener,ItemListener {
		
		
	public BufferedImage myImage;
	public ArrayList<packmen> listPackmen = new ArrayList<>();
	public ArrayList<fruits> listFruits = new ArrayList<>();
	MenuItem item1;
	MenuItem item2;
	Menu menu;
	MenuBar menuBar;
	private boolean addFruit = false;
	private boolean addPackmen = false;
	Image fruitIcon;
	Image packmenIcon;

	public GuiEX3(){
		initGUI();
		this.addMouseListener(this);
	}
	private void initGUI() 
	{	
		fruitIcon = Toolkit.getDefaultToolkit().getImage("C:\\Pictures_For_Ex3\\FRUIT.png");
		packmenIcon = Toolkit.getDefaultToolkit().getImage("C:\\Pictures_For_Ex3\\packman-png-8.png");
		this.menuBar = new MenuBar();
		this.menu = new Menu("Add"); 
		this.item1 = new MenuItem("Pakcmen");
		this.item1.addActionListener(this);
		this.item2 = new MenuItem("Fruit");
		this.item2.addActionListener(this);
		menuBar.add(menu);
		this.menu.add(item1);
		this.menu.add(item2);
		this.setMenuBar(menuBar);
		
		try {
			 this.myImage = ImageIO.read(new File("C:\\Users\\salim\\Desktop\\μιξεγιν\\Projects\\GIS_Ex02\\Ariel1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	

	int x = 2;
	int y = 2;

	public void paint(Graphics g)
	{
		
		g.drawImage(myImage, 0, 0, this);
		if(x!=-1 && y!=-1)
		{
			int r = 10;
			x = x - (r / 2);
			y = y - (r / 2);
			g.fillOval(x, y, r, r);
		}
		if(!listFruits.isEmpty())
		{
			for(int i=0 ; i<listFruits.size() ; i++)
			{
				int x_fruit =(int) listFruits.get(i).GetX();
				int y_fruit = (int)listFruits.get(i).GetY();
				g.drawImage(fruitIcon,x_fruit, y_fruit, 25, 25,this);
			}

		}

		if(!listPackmen.isEmpty())
		{
			for(int i=0 ; i<listPackmen.size() ;i++)
			{
				int x_pacman =(int) listPackmen.get(i).getPixelPoint().GetX();
				int y_pacman = (int)listPackmen.get(i).getPixelPoint().GetY();
				g.drawImage(packmenIcon,x_pacman, y_pacman, 25, 25,this);
			}
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		coordsToPixel m = new coordsToPixel();
		double x = e.getX();
		double y = e.getY();
		System.out.println("the X pixel is : "+e.getX()+", The Y pixel is:" +  e.getY());
		System.out.println("the GPS point: ("+m.convertFromPixelToGPS(e.getX(),e.getY())+")");
		repaint();
		if(addFruit){
			fruits fruit1 = new fruits();
			fruit1.setFruitsPosition(x,y);
			listFruits.add(fruit1);
			System.out.println("location = "+listFruits.get(listFruits.size()-1).getPixelPoint().GetX() +","+
					listFruits.get(listFruits.size()-1).getPixelPoint().GetY());
		}
		if(addPackmen){ 
			packmen p = new packmen();
			p.setPackmenPosition(x,y);
			listPackmen.add(p);
			System.out.println("location = "+listPackmen.get(listPackmen.size()-1).getPixelPoint().GetX()+","+
					listPackmen.get(listPackmen.size()-1).getPixelPoint().GetY());
			System.out.println("location = "+listPackmen.get(listPackmen.size()-1).get3Dpoint().x() +","+
					listPackmen.get(listPackmen.size()-1).get3Dpoint().y());
		}

		repaint();
		}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {

	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(item1))
		{
			addPackmen = true;
			addFruit = false;
			System.out.println("Press packmen");
		}
		if(event.getSource().equals(item2))
		{
			addPackmen = false;
			addFruit = true;
			System.out.println("Press fruit");
		}

	}
		

	
	public static void main(String[]args) {
		
		GuiEX3 frame = new GuiEX3();
		frame.setVisible(true);
		frame.setSize(frame.myImage.getWidth(), frame.myImage.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
