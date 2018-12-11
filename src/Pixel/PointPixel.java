package Pixel;

public class PointPixel {
	private double x;
	private double y;
	
	private double rangeLeft;
	private double rangeRight;
	private double rangeUp;
	private double rangeDown;
	
	public PointPixel() {
		this.x = 0;
		this.y = 0;
	}
	
	public PointPixel(double x , double y) {
		this.x = x;
		this.y = y;
	}
	public PointPixel setPointpixel(double x , double y) {
		PointPixel p = new PointPixel();
		p.x = x;
		p.y = y;
		return p;
	}
	
	public boolean setRange(double l,double r,double u,double d) {
		this.rangeDown = d;
		this.rangeLeft = l;
		this.rangeRight = r;
		this.rangeUp = u;
		return true;
	}
	
	public double GetX() {
		return this.x;
	}
	
	public double GetY() {
		return this.y;
	}

}
