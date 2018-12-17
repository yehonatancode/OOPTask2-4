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
			MapOptimizer m;
		
			try {
			m = new MapOptimizer();
			double MinMaxdiff_Y = m.LeftUpCorner.x() - m.RighttDownCorner.x();
			double MinMaxdiff_X = m.RighttDownCorner.y() - m.LeftDownCorner.y();
			
			double diffCoord_X=(MinMaxdiff_X*p.GetX())/m.getWidth();
			double diffCoord_Y=(MinMaxdiff_Y*p.GetY())/m.getHight();

			double FullCoord_X=diffCoord_X+m.LeftDownCorner.x();
			double FullCoord_Y=diffCoord_Y+m.LeftDownCorner.y();

			Point3D ThisPoint=new Point3D(FullCoord_X,FullCoord_Y);
			return ThisPoint;	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
	}
	public Point3D convertFromPixelToGPS (double x , double y) {
		MapOptimizer m;
		
		try {
			m = new MapOptimizer();
			double MinMaxdiff_Y = m.LeftUpCorner.x() - m.RighttDownCorner.x();;
			double MinMaxdiff_X = m.RighttUpCorner.y() - m.LeftUpCorner.y();
			System.out.println(MinMaxdiff_Y);

			double diffCoord_X = (MinMaxdiff_X* x)/m.myImage.getWidth();
			System.out.println(m.myImage.getHeight());
			double diffCoord_Y = (MinMaxdiff_Y* y)/m.myImage.getHeight();
			System.out.println(diffCoord_Y);
			double FullCoord_X=m.LeftUpCorner.x() - diffCoord_Y;
			double FullCoord_Y=m.LeftDownCorner.y() + diffCoord_X;
			System.out.println(FullCoord_Y);
			Point3D ThisPoint=new Point3D(FullCoord_X,FullCoord_Y);
			return ThisPoint;	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
	}
	
	
	

}
