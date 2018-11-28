package GIS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Time;
import java.util.Date;

import File_format.Csv2Kml;
import Geom.Point3D;

public class My_Meta_data implements Meta_data {
	public Date date1 = new Date();
	
	

	@Override
	public long getUTC() {
		long g  = System.currentTimeMillis();
		return g;
	}

	@Override
	public Point3D get_Orientation() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * this function return a string contains all the data from the object
	 */
	public String toString() {
		return null;
	}

}
