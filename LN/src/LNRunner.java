
public class LNRunner {
	static ListNode p;
	static ListNode q;

	public static void main(String[] args) {
		addP(1);
		addP(2);
		addP(3);
		// addP(4);
		// addP(2);
		//
		// addQ(7);
		// addQ(1);
		// addQ(0);
		// addQ(6);
		// addQ(18);
		// addQ(12);
		// addQ(8);
		
		firstLast();

		ListNode current = p;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		ListNode current2 = q;
		while (current2 != null) {
			System.out.print(current2.data + " ");
			current2 = current2.next;
		}

	}

	public static void firstLast() {
		ListNode temp = null;
	    if(p != null) {
	        temp = p;
	        temp.next = null;
	    }
	    if(p.next != null) {
	        p = p.next;
	    }
	    ListNode current = p;
	    while(current.next != null) {
	        current = current.next;
	    }
	    current.next = temp;
	}

	// post: appends the value to the end of the plist
	public static void addP(int value) {
		if (p == null)
			p = new ListNode(value);
		else {
			ListNode current = p;
			while (current.next != null)
				current = current.next;
			current.next = new ListNode(value);
		}
	}

	// post: appends the value to the end of the qlist
	public static void addQ(int value) {
		if (q == null)
			q = new ListNode(value);
		else {
			ListNode current = q;
			while (current.next != null)
				current = current.next;
			current.next = new ListNode(value);
		}
	}

}
