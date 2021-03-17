package test;

import java.util.NoSuchElementException;


public class SList<E> {
	public static void main(String[] args) {
		SList<String> s = new SList<String>();
		s.insertFront("orange"); s.insertFront("apple");
		s.insertAfter("cherry", s.head.getNext());
		s.insertFront("pear");
		
		s.print();
		System.out.println(": s의 길이 = " + s.size()+"\n");
		System.out.println("체리가 \t"+s.search("cherry")+"번째에 있다.");
		System.out.println("키위가 \t"+s.search("kiwi")+"번째에 있다.\n");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s의 길이 = " + s.size());System.out.println();
		s.deleteFront();
		s.print();
		System.out.println(": s의 길이 = " + s.size());System.out.println();
		
		SList<Integer> t = new SList<Integer>();
		t.insertFront(500); t.insertFront(200);
		t.insertAfter(400, t.head);
		t.insertFront(100);
		t.insertAfter(300, t.head.getNext());
		t.print();
		System.out.println(": t의 길이 = " + t.size());
	}
	
	protected Node head;
	private int size;
	
	public SList() { // 생성자
		head = null;
		size = 0;
	}
	public void insertFront(E item) { // 노드 맨 앞에 아이템 추가
		head = new Node(item, head);
		size++;
	}
	public void insertAfter(E item, Node p) { // 노드p 뒤에 아이템 추가
		p.setNext(new Node(item, p.getNext()));
		size++;
	}
	public void deleteFront() {
		if(size == 0) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	public void deleteAfter(Node p) { // 노드p 뒤의 노드 삭제
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
