package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	ArrayList<T> list = new ArrayList<T>();
	
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return null;
	}
	
	public void add(T val) {
		list.add(val);
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}