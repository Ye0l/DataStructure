package week11;

public class BHeapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry[] a = new Entry[16];
		a[1] = new Entry(90, "watermelon");
		a[2] = new Entry(80, "pear");
		a[3] = new Entry(70, "melon");
		a[4] = new Entry(50, "mango");
		a[5] = new Entry(60, "lime");
		a[6] = new Entry(20, "cherry");
		a[7] = new Entry(30, "grape");
		a[8] = new Entry(35, "orange");
		a[9] = new Entry(10, "apricot");
		a[10] = new Entry(15, "banana");
		a[11] = new Entry(40, "lemon");
		a[12] = new Entry(40, "kiwi");

		BHeap h = new BHeap(a, 12);

		System.out.println("Èü ¸¸µé±â Àü");
		h.creatHeap();
		System.out.println("ÃÖ¼Ò Èü: ");
		h.print();
		System.out.println("min »èÁ¦ ÈÄ");
		System.out.println(h.deleteMin().getValue());
		h.print();
		h.insert(5, "apple");
		System.out.println("5 »ğÀÔ ÈÄ");
		h.print();

	}

}
