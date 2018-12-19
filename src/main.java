import Geom.Point3D;
import Map.MapOptimizer;
import Pixel.PointPixel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.sun.jmx.snmp.Timestamp;

import Algorithm.CsvToGame;
import Algorithm.Game_CSVToKML;
import Algorithm.Multy_CSV;
import Coords.*;
import GIS.My_GIS_Project;

public class main {
	public static void main (String [] args) {
	/**	Point3D p = new Point3D(32.10332, 35.20904,670);
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
			My_GIS_Project project = new My_GIS_Project();
			project = l.run();
			System.out.println(project.toString());
			System.out.println(project.toArray());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}**/
		
	/**	try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\salim\\Desktop\\לימודים\\מונחה עצמים\\מטלה 3\\Ex3 (2)\\Ex3\\data\\game_1543684662657.csv"));
			try {
				reader.readLine();
				String str = reader.readLine();
				System.out.println(str);
				String str1 [] = str.split(",");
				System.out.println(str1[0]);
				
				Timestamp p = new Timestamp();
				System.out.println(p.getDate());
				System.out.println(p.getTimeTicks());
				System.out.println(p.getDateTime());
				Game_CSVToKML k = new Game_CSVToKML("C:\\Users\\salim\\Desktop\\לימודים\\מונחה עצמים\\מטלה 3\\Ex3 (2)\\Ex3\\data\\game_1543684662657.csv",
							"C:\\\\Users\\\\salim\\\\Desktop\\\\לימודים\\\\מונחה עצמים\\\\מטלה 3\\\\Ex3 (2)\\\\Ex3\\\\data\\\\game_1543684662657.kml");
				k.run();
				
				CsvToGame a = new CsvToGame();
				a.run();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}**/
		
		
		Point3D p = new Point3D(32.104262361370715,35.20617349546406);
		PointPixel pp = new PointPixel();
		MapOptimizer m;
		try {
			m = new MapOptimizer();
			int x_pixel = (int) ((p.x()*m.myImage.getWidth())/360);
			int y_pixel = (int) ((p.x()*m.myImage.getHeight())/180);
			pp.setPointpixel(x_pixel, y_pixel);
			System.out.println(pp.GetX() +"," +pp.GetY());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}

