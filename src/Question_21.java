import java.io.IOException;
import java.util.Scanner;


public class Question_21 {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode first;
		ListNode last = new ListNode(0);
		first = last;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				last.next = l1;
				l1 = l1.next;
			}else {
				last.next = l2;
				l2 = l2.next;
			}
			last = last.next;
		}
		if(l1 == null){
			last.next = l2;
		}else{
			last.next = l1;
		}
		return first.next;
	}
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists2(l1.next,l2);
			return l1;
		}else{
			l2.next = mergeTwoLists2(l1,l2.next);
			return l2;
		}
	}
	/**
	 * @param args
	 */
	public static void f(){
		ListNode[] lists = new ListNode[2];
		lists[0] = new ListNode(0);
		lists[1] = new ListNode(1);
		lists[0].val = 0;
		lists[1].val = 1;
		ListNode first = new ListNode(9);
		ListNode last = new ListNode(10);
		first = last;
		//last = mergeTwoLists(lists[0],lists[1]);
		//last.val
		System.out.println(first.val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		scan.close();
//		ListNode[] lists = new ListNode[2];
//		lists[0] = new ListNode(0);
//		lists[1] = new ListNode(1);
//		lists[0].val = 0;
//		lists[1].val = 1;
//		ListNode first = new ListNode(9);
//		ListNode last = new ListNode(10);
//		last = first;
//		last = mergeTwoLists(lists[0],lists[1]);
//		System.out.println(first.next.val);
		f();
	}

}
