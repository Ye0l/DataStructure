package week11;

public class Huffman {
	private HuffmanEntry[] a;
	private int N;

	public Huffman(HuffmanEntry[] harray, int intialSize) {
		a = harray;
		N = intialSize;
	}

	public int size() {
		return N;
	}

	public void creatHeap() {
		for (int i = N / 2; i > 0; i--) {
			downheap(i);
		}
	}

	public HuffmanEntry createTree() {
		while (size() > 1) {
			HuffmanEntry e1 = deleteMin();
			HuffmanEntry e2 = deleteMin();
			HuffmanEntry temp = new HuffmanEntry(e1.getKey() + e2.getKey(), e1.getValue() + e2.getValue(), e1, e2, " ");
			insert(temp);
		}
		return deleteMin();
	}

	public void preorder(HuffmanEntry node) {
		if (node.getLeft() != null) {
			node.getLeft().setCode(node.getCode() + "0");
			preorder(node.getLeft());
		}
		if (node.getRight() != null) {
			node.getRight().setCode(node.getCode() + "1");
			preorder(node.getRight());
		}
		if (node.getValue().length() == 1) {
			System.out.print(node.getValue() + ":" + node.getCode() + "  ");
		}
	}

	public void insert(HuffmanEntry newEntry) {
		a[++N] = newEntry;
		upheap(N);
	}

	public HuffmanEntry deleteMin() {
		HuffmanEntry max = a[1];
		swap(1, N--);
		a[N + 1] = null;
		downheap(1);
		return max;
	}

	private boolean greater(int i, int j) {
		return a[i].getKey() > a[j].getKey();
	}

	private void swap(int i, int j) {
		HuffmanEntry temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private void downheap(int i) {
		while (2 * i <= N) {
			int k = 2 * i;
			if (k < N && greater(k, k + 1))
				k++;
			if (!greater(i, k))
				break;
			swap(i, k);
			i = k;
		}
	}

	private void upheap(int j) {
		while (j > 1 && greater(j / 2, j)) {
			swap(j / 2, j);
			j = j / 2;
		}
	}

	public void print() {
		for (int i = 1; i < N + 1; i++) {
			System.out.printf("[" + a[i].getKey() + " " + a[i].getValue() + "]");
		}
		System.out.println();
	}

}
