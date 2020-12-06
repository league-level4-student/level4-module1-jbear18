package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] values;

	public ArrayList() {
		values = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {


		return values[loc];
	}

	public void add(T val) {
		T[] num = (T[]) new Object[values.length + 1];
		num[values.length] = val;
		for (int i = 0; i < values.length; i++) {
			num[i] = values[i];
		}
		num[num.length - 1] = val;
		values = num;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
T[]num;
num=(T[]) new Object[values.length+1];

if(loc==0) {
	num[0]=val;
	
	for (int i = 0; i < num.length; i++) {
		num[i]=values[i-1];
	}
	
}
else if(loc>0 && loc<values.length) {
	for (int i = 0; i < loc; i++) {
		num[i]=values[i];
	}
	num[loc]= val;
	for (int i = loc+1; i < num.length; i++) {
		num[i]=values[i-1];
	}
}else {
	for (int i = 0; i < num.length; i++) {
		num[i]=values[i];
	}
	num[num.length-1]=val;
}
num[loc]=val;
num=values;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {

	}

	public void remove(int loc) throws IndexOutOfBoundsException {

	}

	public boolean contains(T val) {

		return false;
	}
}