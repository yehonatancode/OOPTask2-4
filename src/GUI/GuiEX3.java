package GUI;

import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import Coords.coordsToPixel;

public class GuiEX3 extends JFrame implements MouseListener {
		
		
	public BufferedImage myImage;

	public GuiEX3(){
		initGUI();
		this.addMouseListener(this);
	}
	private void initGUI() 
	{
		MenuBar menuBar = new MenuBar();
		Menu menu = new Menu("Add"); 
		MenuItem item1 = new MenuItem("Pakcmen");
		MenuItem item2 = new MenuItem("fruit");
		
		menuBar.add(menu);
		menu.add(item1);
		menu.add(item2);
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
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		coordsToPixel m = new coordsToPixel();
		System.out.println("the X pixel is : "+e.getX()+", The Y pixel is:" +  e.getY());
		System.out.println("the GPS point: ("+m.convertFromPixelToGPS(e.getX(),e.getY())+")");
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
	
	public static void main(String[]args) {
		
		GuiEX3 frame = new GuiEX3();
		frame.setVisible(true);
		frame.setSize(frame.myImage.getWidth(), frame.myImage.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		
	}
}
