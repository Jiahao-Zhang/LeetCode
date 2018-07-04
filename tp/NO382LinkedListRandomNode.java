package pers.jiahao.leetcode.tp;

import java.util.Random;

public class NO382LinkedListRandomNode {
	ListNode head = null;
    public NO382LinkedListRandomNode(ListNode head) {
        this.head = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode temp = head;
        Random rand = new Random();
        int result = temp.val;
        for(int i = 1;temp.next!=null;i++){
            temp = temp.next;
            if(rand.nextInt(i+1)==i){
                result = temp.val;
            }
        }
        
        return result;
    }

}
