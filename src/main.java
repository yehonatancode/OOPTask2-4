import Geom.Point3D;

import Algorithm.Multy_CSV;
import Coords.*;
import GIS.My_GIS_Project;

public class main {
	public static void main (String [] args) {
		Point3D p = new Point3D(32.10332, 35.20904,670);
		Point3D p1 = new Point3D(32.10635, 35.20523,650);
		My_coords c = new My_coords();
		double d = c.distance3d(p, p1);
		System.out.println(p.x());
		System.out.println(d);
		Point3D vector= new Point3D(10, 20,10);   
		System.out.println(c.add(p,vector));
		double [] a = c.azimuth_elevation_dist(p, p1);
		System.out.println("azimuth between two points: " + a[0]);
		System.out.println("elevation between two points: " + a[1]);
		System.out.println("the distance between two point: "+a[2]);
      
		Multy_CSV l = new Multy_CSV();
		try {
			l.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

