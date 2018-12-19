package packmenAndFruits;

import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Coords.coordsToPixel;
import Geom.Point3D;
import Pixel.PointPixel;

public class fruits {
	BufferedImage a;
	private PointPixel pixelP;
	private Point3D gpsP;
	private int Weight;
	
	public fruits() {
		try {
			a = ImageIO.read(new File("C:\\\\Pictures_For_Ex3\\\\FRUIT.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.pixelP = new PointPixel();
		this.gpsP = new Point3D(0, 0);
		this.setWeight(1);
	}
	
	

	public fruits(int x, int y) {
		this.pixelP.setPointpixel(x, y);
		coordsToPixel con = new coordsToPixel();
		this.gpsP = con.convertFromPixelToGPS(this.pixelP);
	}

	public void setFruitsPositionFromPixel(PointPixel p ) {
		this.pixelP = p;
		coordsToPixel con = new coordsToPixel();
		this.gpsP = con.convertFromPixelToGPS(p);
	}
	public void setFruitsPosition(double x , double y ) {
		this.pixelP.setPointpixel(x, y);
		coordsToPixel con = new coordsToPixel();
		this.gpsP = con.convertFromPixelToGPS(this.pixelP);
	}
	
	public void setFruitPositionFromGps(Point3D p ) {
		this.gpsP = p;
		coordsToPixel con = new coordsToPixel();
		this.pixelP = con.converterFromCoordsToPixel(p);
	}
	
	public Point3D get3Dpoint() {
		return this.gpsP;
	}
	public PointPixel getPixelPoint() {
		return this.pixelP;
	}
	public double GetX() {
		return this.pixelP.GetX();
	}
	
	public double GetY() {
		return this.pixelP.GetY();
	}



	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}



}
