package pers.jiahao.leetcode.tp;

public class NO328OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode oddHead = head;
        ListNode oddTail = head;
        ListNode evenHead = head.next;
        ListNode evenTail = evenHead;
        ListNode temp = head;
        int index = 1;
        while(index!=3&&temp!=null){
            temp = temp.next;
            index++;
        }
        while(temp!=null){
            if(index%2==0){
                evenTail.next = temp;
                evenTail = evenTail.next;
            }else{
                oddTail.next = temp;
                oddTail = oddTail.next;
            }
            temp = temp.next;
            evenTail.next = null;
            oddTail.next = null;
            index++;
        }
        oddTail.next = evenHead;
        return oddHead;
        
    }

}
