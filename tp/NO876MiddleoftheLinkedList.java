package pers.jiahao.leetcode.tp;

public class NO876MiddleoftheLinkedList {
	 public ListNode middleNode(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	        while(fast!=null&&fast.next!=null){
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	        
	    }

}
