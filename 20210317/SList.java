package test;

import java.util.NoSuchElementException;


public class SList<E> {
	public static void main(String[] args) {
		SList<String> s = new SList<String>();
		s.insertFront("orange"); s.insertFront("apple");
		s.insertAfter("cherry", s.head.getNext());
		s.insertFront("pear");
		
		s.print();
		System.out.println(": s�� ���� = " + s.size()+"\n");
		System.out.println("ü���� \t"+s.search("cherry")+"��°�� �ִ�.");
		System.out.println("Ű���� \t"+s.search("kiwi")+"��°�� �ִ�.\n");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s�� ���� = " + s.size());System.out.println();
		s.deleteFront();
		s.print();
		System.out.println(": s�� ���� = " + s.size());System.out.println();
		
		SList<Integer> t = new SList<Integer>();
		t.insertFront(500); t.insertFront(200);
		t.insertAfter(400, t.head);
		t.insertFront(100);
		t.insertAfter(300, t.head.getNext());
		t.print();
		System.out.println(": t�� ���� = " + t.size());
	}
	
	protected Node head;
	private int size;
	
	public SList() { // ������
		head = null;
		size = 0;
	}
	public void insertFront(E item) { // ��� �� �տ� ������ �߰�
		head = new Node(item, head);
		size++;
	}
	public void insertAfter(E item, Node p) { // ���p �ڿ� ������ �߰�
		p.setNext(new Node(item, p.getNext()));
		size++;
	}
	public void deleteFront() {
		if(size == 0) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	public void deleteAfter(Node p) { // ���p ���� ��� ����
		Node t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}
	public int search(E target) {
		Node p = head;
		for(int k = 0; k < size; k++) {
			if(p.getItem() == target) return k;
			p = p.getNext();
		}
		return -1;
	}
	public void print() {
		for(Node p = head; p != null; p = p.getNext()) {
			System.out.print(p.getItem() + "\t ");
		}
//		System.out.println();
	}
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
}
