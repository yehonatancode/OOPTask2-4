import Geom.Point3D;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Timestamp;
import java.util.Calendar;
import java.util.Date; 

import org.omg.CORBA.Current;

import Algorithm.Multy_CSV;
import Coords.*;
import File_format.Csv2Kml;

public class main {
	public static void main (String [] args) throws Exception {
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
		l.run();
	}
	//1512125348
	//1518000548


}

