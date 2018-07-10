package pers.jiahao.leetcode.tp;

import java.util.Stack;

public class NO445AddTwoNumbersII {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        ListNode head1 = l1;
        ListNode head2 = l2;
        while(head1!=null){
            stack1.push(head1);
            head1 = head1.next;
        }
        while(head2!=null){
            stack2.push(head2);
            head2 = head2.next;
        }
        boolean ifAddOne = false;
        ListNode head = new ListNode(-1);
        while(!stack1.empty()&&!stack2.empty()){
            int num1 = stack1.pop().val;
            int num2 = stack2.pop().val;
            int sum = 0;
            int number = -1;
            if(ifAddOne){
                sum = num1+num2+1;
            }else{
                sum = num1+num2;
            }
            if(sum>=10){
                ifAddOne = true;
                number = sum-10;
            }else{
                ifAddOne = false;
                number = sum;
            }
            ListNode node = new ListNode(number);
            node.next = head.next;
            head.next = node;
        }
        while(!stack1.empty()){
            int num1 = stack1.pop().val;
            int number  = -1;
            if(ifAddOne){
                num1++;
            }
            if(num1>=10){
                ifAddOne = true;
                number = num1-10;
            }else{
                ifAddOne = false;
                number = num1;
            }
            ListNode node = new ListNode(number);
            node.next = head.next;
            head.next = node;
        }
        while(!stack2.empty()){
            int num2 = stack2.pop().val;
            int number  = -1;
            if(ifAddOne){
                num2++;
            }
            if(num2>=10){
                ifAddOne = true;
                number = num2-10;
            }else{
                ifAddOne = false;
                number = num2;
            }
            ListNode node = new ListNode(number);
            node.next = head.next;
            head.next = node;
        }
        if(ifAddOne){
            ListNode node = new ListNode(1);
            node.next = head.next;
            head.next = node;
        }
        
        return head.next;
    }

}
