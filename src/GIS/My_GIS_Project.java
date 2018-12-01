package GIS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class My_GIS_Project implements GIS_project {
	public ArrayList<GIS_layer> project1;

	@Override
	public boolean add(GIS_layer a) {
		try {
			this.project1.add(a);
			return true;	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return false;
		}
	}

	@Override
	public boolean addAll(Collection<? extends GIS_layer> a) {
		try {
			this.project1.addAll(0, a);
			return true;	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return false;
		}
	}

	@Override
	public void clear() {
		try {
			this.project1.clear();
			
		} catch (Exception e) {
			System.out.println("problem with Layer");
			
		}
		
	}

	@Override
	public boolean contains(Object a) {
		try {
			this.project1.contains(a);
			return true;	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return false;
		}
	}

	@Override
	public boolean containsAll(Collection<?> a) {
		try {
			this.project1.containsAll(a);
			return true;	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return false;
		}
	}

	@Override
	public boolean isEmpty() {
		try {
			this.project1.isEmpty();
			return true;	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return false;
		}
	}

	@Override
	public Iterator<GIS_layer> iterator() {
		return this.project1.iterator();
	}

	@Override
	public boolean remove(Object a) {
		try {
			this.project1.remove(a);
			return true;	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return false;
		}
	}

	@Override
	public boolean removeAll(Collection<?> a) {
		try {
			this.project1.removeAll(a);
			return true;	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return false;
		}
	}

	@Override
	public boolean retainAll(Collection<?> a) {
		try {
			this.project1.retainAll(a);
			return true;	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return false;
		}
	}

	@Override
	public int size() {
		try {
			
			return this.project1.size();	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return 0;
		}
	}

	@Override
	public Object[] toArray() {
		try {
			return this.project1.toArray();	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return null;
		}
	}

	@Override
	public <T> T[] toArray(T[] a) {
		try {
			return this.project1.toArray(a);	
		} catch (Exception e) {
			System.out.println("problem with Layer");
			return null;
		}
	}

	@Override
	public Meta_data get_Meta_data() {
	My_Meta_data m = new My_Meta_data();
	m.getUTC();
	return m;
	}
	

}
