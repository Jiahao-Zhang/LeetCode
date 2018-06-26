package pers.jiahao.leetcode.tp;

public class NO234PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode tail = reverse(head);
        while(head!=null){
            if(head.val!=tail.val){
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode first = new ListNode(0);
        ListNode temp = head;
        ListNode cur = first;
        while(temp!=null){
            ListNode node = new ListNode(temp.val);
            node.next = cur.next;
            cur.next = node;
            temp = temp.next;
        }
        return cur.next;
    }

}
