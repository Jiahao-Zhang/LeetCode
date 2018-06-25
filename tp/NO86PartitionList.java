package pers.jiahao.leetcode.tp;

public class NO86PartitionList {
	public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode first = small;
        ListNode second = large;
        while(head!=null){
            if(head.val<x){
                small.next = head;
                small = small.next;
            }else{
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = second.next;
        return first.next;
    }

}
