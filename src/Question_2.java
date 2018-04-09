
public class Question_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,3};
		int[] b = {4,6,5};
		ListNode first = null,last = null,newNode = null;
		for(int i=0;i<3;i++){
			newNode = new ListNode(a[i]);
			if(first == null){
				first = newNode;
				last = newNode;
			}
			else{
				last.next = newNode;
				last = newNode;
			}
		}
		ListNode l1,l2;
		l1 = buildNode(a);
		l2 = buildNode(b);
		System.out.println(addTwoNumbers(l1, l2).next.next.val);
	}
	public static ListNode buildNode(int[] a){
		ListNode first = null,last = null,newNode = null;
		for(int i=0;i<3;i++){
			newNode = new ListNode(a[i]);
			if(first == null){
				first = newNode;
				last = newNode;
			}
			else{
				last.next = newNode;
				last = newNode;
			}
		}
		return first;
	}
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1,q = l2,curr = dummyHead;
		int carry = 0;
		//System.out.println(p.val);
		while(p!=null || q!=null){
			int x = (p!=null) ? p.val:0;
			int y = (q!=null) ? q.val:0;
			int sum = x + y + carry;
			carry = sum/10;
			curr.next = new ListNode(sum%10);
			curr = curr.next;
			if(p!=null) p = p.next;
			if(q!=null) q = q.next;
		}
		if(carry>0){
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

}


