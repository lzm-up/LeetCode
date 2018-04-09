
public class Question_19 {

	public ListNode removeNthFromEnd(ListNode head,int n){
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		int length = 0;
		ListNode first = head;
		while(first != null){
			length++;
			first = first.next;
		}
		length -= n;
		first = dummy;
		while(length > 0){
			length--;
			first = first.next;
		}
		first.next = first.next.next;
		return dummy.next;
	}
	public static ListNode buildNode(int[] a){
		ListNode first = null,last = null,newNode = null;;
		for(int i = 0;i < a.length;i++){
			newNode = new ListNode(a[i]);
			if(first == null){
				first = newNode;
				last = newNode;
			}else{
				last.next = newNode;
				last = newNode;
			}
		}
		return first;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		//System.out.println(buildNode(a).next.val);
		ListNode list = buildNode(a);
		ListNode first = list;
		first = first.next;
		first.val = 9;
		System.out.println(list.next.val);
		System.out.println(first.val);
	}
}
