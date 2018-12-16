package Coords;
import Geom.Point3D;
import Map.MapOptimizer;
import Pixel.PointPixel;


public class coordsToPixel {

	//convert Gps point to Coords on the map
	public PointPixel converterFromCoordsToPixel(Point3D p) {
		PointPixel pixel = new PointPixel();
		
		return pixel;
	}
	
	// convert Pixel on map to GPS point
	public Point3D convertFromPixelToGPS (PointPixel p) {
		try {
			
			MapOptimizer m = new MapOptimizer();
			Point3D point = new Point3D(m.LeftUpCorner.x() +(p.GetX()*m.Range()) , m.LeftUpCorner.y() +(p.GetY()*m.Range()));
			return point;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public Point3D convertFromPixelToGPS (double x , double y) {
		try {
			
			MapOptimizer m = new MapOptimizer();
			Point3D point = new Point3D(m.LeftUpCorner.x() + (x /m.Range()) ,m.LeftUpCorner.y() +(y / m.Range()));
			return point;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
