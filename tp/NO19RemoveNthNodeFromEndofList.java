package pers.jiahao.leetcode.tp;

public class NO19RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp2 = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        if(length == 0){
            return null;
        }
        for(int i = 1;i<length-n;i++){
            temp2 = temp2.next;
        }
        if(length-n==0){
            return head.next;
        }
        if(temp2.next==null){
            return null;
        }else{
            temp2.next = temp2.next.next;
        }
        
        return head;
    }

}
