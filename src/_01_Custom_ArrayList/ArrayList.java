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

	
	for (int i = 0; i < num.length; i++) {
		if(i<loc) {
			num[i]=values[i];
	}
		
	else if(i>loc) {
		num[i]=values[i-1];
	}else {
		num[i]=val;
	}

}
	values= num;

	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
values[loc]= val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
T[] num= (T[])new Object[values.length-1];
for (int i = 0; i < values.length; i++) {
	if(i<loc) {
		num[i]= values[i];
	}
	else if(i>loc) {
		num[i-1]= values[i];
	}else {
		
	}
}
values=num;
	}

	public boolean contains(T val) {
for (int i = 0; i < values.length; i++) {
	if(values[i]==val) {
		return true;
	}
}
		return false;
	}
}