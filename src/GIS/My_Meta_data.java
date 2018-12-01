package GIS;

import Geom.Point3D;

public class My_Meta_data implements Meta_data {
	
	
	public String s;
	public String[] parsed;
	public long UTC;

	@Override
	public long getUTC() {
		this.UTC  = Long.parseLong(this.parsed[3]);
		return UTC;
	}
	@Override
	public Point3D get_Orientation() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * this function return a string contains all the data from the object
	 */
	@Override
	public String toString() {
		this.s = ""+this.UTC;
		return s;
	}

	

}
