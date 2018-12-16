package packmenAndFruits;

import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Coords.coordsToPixel;
import Geom.Point3D;
import Pixel.PointPixel;

public class packmen {
	BufferedImage a;
	private PointPixel pixelP;
	private Point3D gpsP;
	
	public packmen() {
		try {
			a = ImageIO.read(new File("C:\\Users\\salim\\Desktop\\μιξεγιν\\Projects\\GIS_Ex02\\packman-png-8.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.pixelP = new PointPixel();
		this.gpsP = new Point3D(0, 0);
		
	}

	public packmen(int x, int y) {
		this.pixelP.setPointpixel(x, y);
		coordsToPixel con = new coordsToPixel();
		this.gpsP = con.convertFromPixelToGPS(this.pixelP.GetX(),this.pixelP.GetY());
	}

	public void setPackmenPosition(PointPixel p ) {
		this.pixelP = p;
		coordsToPixel con = new coordsToPixel();
		this.gpsP = con.convertFromPixelToGPS(p.GetX(),p.GetY());
	}
	public void setPackmenPosition(double x , double y ) {
		this.pixelP.setPointpixel(x, y);
		coordsToPixel con = new coordsToPixel();
		this.gpsP = con.convertFromPixelToGPS(this.pixelP);
		System.out.println("the convert is " + this.gpsP);
	}
	
	public void paint(int x, int y, ImageObserver o) {
		this.a.createGraphics().drawImage(this.a ,x ,y ,o);
		
	}
	public Point3D get3Dpoint() {
		return this.gpsP;
	}
	public PointPixel getPixelPoint() {
		return this.pixelP;
	}


}
