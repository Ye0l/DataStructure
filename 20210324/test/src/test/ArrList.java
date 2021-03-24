package test;

import java.util.NoSuchElementException;

public class ArrList <E> {
	private E a[];
	private int size;
	public ArrList() {
		a = (E[]) new Object[1];
		size = 0;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void resize(int newSize) {
		Object[] t = new Object[newSize];
		for(int i = 0; i < size; i++)
			t[i] = a[i];
		a = (E[]) t;
	}
	public void insertLast(E newItem) {
		if(size == a.length)
			resize(a.length*2);
		a[size++] = newItem;
	}
	public void insert(E newItem, int k) {
		if(size == a.length)
			resize(a.length*2);
		for(int i = size-1; i >= k; i--) {
			a[i+1] = a[i];
		}
		a[k] = newItem;
		size++;
	}
	public E delete(int k) {
		if(isEmpty()) throw new NoSuchElementException();
		if(size == a.length) resize(a.length*2);
		E item = a[k];
		for(int i = k; i < size; i++) {
			a[i] = a[i+1];
		}
		size--;
		if(size > 0 && size == a.length / 4)
			resize(a.length / 2);
		return item;
	}
}
