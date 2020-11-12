package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[]values;
	public ArrayList() {
		values=(T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return null;
	}
	
	public void add(T val) {
		T[]num= (T[]) new Object[values.length+1];
		for (int i = 0; i < values.length; i++) {
			num[i]=values[i];
		}
		num[num.length-1]=val;
		values=num;
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