package packmenAndFruits;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageIO;

import Coords.coordsToPixel;
import Geom.Point3D;
import Pixel.PointPixel;

public class packmen {
	private PointPixel pixelP;
	private Point3D gpsP;
	private double speed;

	private ArrayList<Point3D> d3path;
	private ArrayList<PointPixel> Pixelpath;

	public packmen() {
		
		this.pixelP = new PointPixel();
		this.gpsP = new Point3D(0, 0);
		this.speed = 1;
		this.d3path = new ArrayList<Point3D>();
		this.Pixelpath = new ArrayList<PointPixel>();
	}

	public packmen(int x, int y) {
		this.pixelP.setPointpixel(x, y);
		coordsToPixel con = new coordsToPixel();
		this.gpsP = con.convertFromPixelToGPS(this.pixelP.GetX(),this.pixelP.GetY());
		this.speed = 1;
		this.d3path = new ArrayList<Point3D>();
		this.Pixelpath = new ArrayList<PointPixel>();
	}

	public void setPackmenPosition(Point3D p ) {
		this.gpsP = p;
		coordsToPixel con = new coordsToPixel();
		this.pixelP = con.converterFromCoordsToPixel(p);
	}

	public void setPackmenPosition(PointPixel p ) {
		this.pixelP = p;
		coordsToPixel con = new coordsToPixel();
		this.gpsP = con.convertFromPixelToGPS(p.GetX(),p.GetY());
	}

	public void setPackmenPosition(double x , double y ) {
		this.pixelP.setPointpixel(x, y);
		coordsToPixel con = new coordsToPixel();
		this.gpsP = con.convertFromPixelToGPS(this.pixelP.GetX(),this.pixelP.GetY());
	}

	public Point3D get3Dpoint() {
		return this.gpsP;
	}
	public PointPixel getPixelPoint() {
		return this.pixelP;
	}
	public void setSpeed(double s) {
		this.speed = s;
	}
	public double getSpeed() {
		return this.speed;
	}

	////////////////////////////////////////////////////////////////
	// the GPS path
	public void add3Dpath(Point3D p) {
		this.d3path.add(p);
	}

	public Iterator<Point3D> pathIterator() {
		return this.d3path.iterator();
	}

	public Point3D getStep(int i ) {
		return this.d3path.get(i);
	}
/////////////////////////////////////////////////////////////
	//The pixel path
	public void addPixelPath(PointPixel p ) {
		this.Pixelpath.add(p);
	}
	public Iterator<PointPixel> pixelpathIterator(){
		return this.Pixelpath.iterator();
	}
	public PointPixel getPixelStep(int i) {
		return this.Pixelpath.get(i);
	}
	public int getPathSize () {
		System.out.println(this.Pixelpath.size());
		System.out.println(this.d3path.size());
		return this.Pixelpath.size();
	}
}





