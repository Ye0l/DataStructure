package nodeTest;

public class Linked_List_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList L = new LinkedList();
			System.out.println("(1) ���� ����Ʈ�� ��� 3�� �����ϱ�");
			L.insertLastNode("��");
			L.insertLastNode("��");
			L.insertLastNode("��");
			L.printList();
			System.out.println("(2) �� ��� �ڿ� �� ��� �����ϱ�");
			ListNode pre = L.searchNode("��");
			if(pre == null)
				System.out.println("�˻����� >> ã�� �����Ͱ� �����ϴ�.");
			else {
				L.insertMiddleNode(pre, "��");
				L.printList();
			}
			System.out.println("(3) ����Ʈ�� ��带 �������� �ٲٱ�");
			L.reverseList();
			L.printList();
			System.out.println("(4) ����Ʈ�� ������ ��� �����ϱ�");
			L.deleteLastNode();
			L.printList();
	}

}