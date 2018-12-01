package GIS;

import Geom.Geom_element;
import Geom.Point3D;

public class My_GIS_element implements GIS_element {
	public Point3D p;
	public String s ;
	public String time;


	
	public void Set_My_GIS_element(String parsed []) {
		this.p = new Point3D(Double.parseDouble(parsed[7]),Double.parseDouble(parsed[6]),Double.parseDouble(parsed[8]));
		this.time = parsed[3];
		//this.color = new 
	}
	
	public Geom_element getGeom() {
		return this.p;

	}

	@Override
	public My_Meta_data getData() {
		My_Meta_data m = new My_Meta_data();
		m.getUTC();
		return m;
	}

	@Override
	public void translate(Point3D vec) {
		this.p.add(vec.x(), vec.y());
	}
	

}
