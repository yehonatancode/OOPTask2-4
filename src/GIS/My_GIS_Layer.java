package GIS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class My_GIS_Layer implements GIS_layer {
	public ArrayList<GIS_element> layer1;
	public String color;
	
	public String [] colors = {"#red","#green","#pink","#yellow","#blue"};
	Random ran = new Random();
	

	public My_GIS_Layer() {
		this.layer1= new ArrayList<GIS_element>();
		String s_ran = this.colors[ran.nextInt(this.colors.length)];
		this.color = s_ran;
	}
	public String get_color() {
		return this.color;
	}

	@Override
	public boolean add(GIS_element e) {
		layer1.add(e);
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends GIS_element> c) {
		this.layer1.addAll(c);
		return true;
	}

	@Override
	public void clear() {
		this.layer1.clear();
	}

	@Override
	public boolean contains(Object o) {
		if (this.layer1.contains(o))
			return true;
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		if (this.layer1.containsAll(c))
			return true;
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(this.layer1.isEmpty())
			return true;
		return false;
	}

	@Override
	public Iterator<GIS_element> iterator() {
		return this.layer1.iterator();
	}

	@Override
	public boolean remove(Object o) {
		if (this.layer1.remove(o))
			return true;
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		if (this.layer1.removeAll(c))
			return true;
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		if(this.layer1.retainAll(c))
			return true;
		return false;
	}

	@Override
	public int size() {
		return this.layer1.size();
	}

	@Override
	public Object[] toArray() {
		return this.layer1.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return this.layer1.toArray(a);

	}

	@Override
	public Meta_data get_Meta_data() {
		My_Meta_data m = new My_Meta_data();
		m.getUTC();
		return m;
	}

}

