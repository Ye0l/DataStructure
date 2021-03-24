package test;

public class Node<E> {
	private E		item;
	private Node<E>	next;
	public Node(E newItem, Node<E> node) { // source -> Generate Constructor using Field.
		super();
		item = newItem;
		next = node;
	}
	public E getItem() {
		return item;
	}
	public void setItem(E item) {
		this.item = item;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
}