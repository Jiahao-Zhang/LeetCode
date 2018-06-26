package pers.jiahao.leetcode.tp;

public class NO142LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                ListNode slow2 = head;
                while(slow!=slow2){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }

}
