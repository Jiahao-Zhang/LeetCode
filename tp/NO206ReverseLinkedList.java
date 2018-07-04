package pers.jiahao.leetcode.tp;

public class NO206ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode node = new ListNode(head.val);
        node.next = null;
        head = head.next;
        while(head!=null){
            node = insertBefore(node,head.val);
            head = head.next;
        }
        return node;
    }
    private ListNode insertBefore(ListNode node, int val){
        ListNode newNode = new ListNode(val);
        newNode.next = node;
        return newNode;
    }

}
