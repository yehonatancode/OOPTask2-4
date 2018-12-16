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
			My_coords con = new My_coords();
			double [] a = con.azimuth_elevation_dist(m.LeftUpCorner,m.RighttUpCorner);
			double distance2 = a[2];	
			System.out.println("the distance is" + distance2);
			double pixelToMeter = distance2 / m.myImage.getWidth() ; // the range
			System.out.println(pixelToMeter);
			Point3D vector = new Point3D(pixelToMeter*(-x), pixelToMeter*(y));
			Point3D point1 = new Point3D(m.LeftUpCorner.x() , m.LeftUpCorner.y());
			Point3D result = con.add(point1, vector);
			System.out.println("result "+result.x()+","+result.y());
			//Point3D point = new Point3D(m.LeftUpCorner.x() + (x /m.Range()) ,m.LeftUpCorner.y() +(y / m.Range()));
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
