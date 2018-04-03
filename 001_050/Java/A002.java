package A001_A050;

public class A002 {
	ListNode l1 = new ListNode(2);
	ListNode l2 = new ListNode(3);

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public void addNode(ListNode l, int d) {
		ListNode current_node = new ListNode(d);
		while (l.next != null) {
			l = l.next;
		}
		l.next = current_node;
	}

	public void print_list(ListNode l) {
		while (l != null) {
			System.out.print(l.val + " ");
			l = l.next;
		}
		System.out.println("");
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode p = result;
		int carray = 0;
		while ((l1 != null) || (l2 != null) || carray != 0) {
			int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carray;
			carray = sum / 10;
			p.next = new ListNode(sum % 10);
			p = p.next;
			l1 = l1 != null ? l1.next : l1;
			l2 = l2 != null ? l2.next : l2;
		}
		return result.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A002 a002 = new A002();
		a002.addNode(a002.l1, 3);
		a002.addNode(a002.l1, 5);
		a002.addNode(a002.l1, 9);
		a002.addNode(a002.l1, 9);
		a002.print_list(a002.l1);

		a002.addNode(a002.l2, 7);
		a002.addNode(a002.l2, 9);
		a002.print_list(a002.l2);

		a002.print_list(a002.addTwoNumbers(a002.l1, a002.l2));

	}

}
