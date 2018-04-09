import java.util.ArrayList;
import java.util.List;


public class Question_23 {

	public static ListNode mergeKLists(ListNode[] lists){
		if(lists.length == 0)
			return null;
		int len = lists.length;
		ListNode last = new ListNode(0);
		ListNode first = last;
		//last = lists[0];
		for(int i = 0;i < len;i++){
			if(i == 0) last = last.next;
			last = mergeTwolists(last,lists[i]);
			first = last;
		}
		return first;
	}
	public static ListNode mergeTwolists(ListNode l1,
			ListNode l2) {
		// TODO Auto-generated method stub
		ListNode first;
		ListNode last = new ListNode(0);
		first = last;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				last.next = l1;
				l1 = l1.next;
			}else{
				last.next = l2;
				l2 = l2.next;
			}
			last = last.next;
		}
		if(l1 == null)
			last.next = l2;
		else 
			last.next = l1;
		return first.next;
	}
	public static ListNode mergeTwolists2(ListNode l1,ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwolists2(l1.next,l2);
			return l1;
		}else{
			l2.next = mergeTwolists2(l1,l2.next);
			return l2;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode[] lists = new ListNode[2];
		lists[0] = new ListNode(0);
		lists[1] = new ListNode(1);
		//lists[0].val = 0;
		//lists[1].val = 1;
		System.out.println(mergeKLists(lists).val);		
	}

}
