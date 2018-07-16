package pers.jiahao.leetcode.tp;

public class NO725SplitLinkedListinParts {
	public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] result = new ListNode[k];
        int[] array = new int[k];
        ListNode head = root;
        int length = 0;
        while(head!=null){
            length++;
            head = head.next;
        }
        int average = length/k;
        int remains = length%k;
        for(int i = 0;i<k;i++){
            if(remains>0){
                array[i] = average+1;
                remains--;
            }else{
                array[i] = average;
            }
        }
        head = root;
        for(int i = 0;i<k;i++){
            if(head==null){
                result[i] = null;
                continue;
            }
            ListNode node = new ListNode(head.val);
            ListNode temp = node;
            array[i]--;
            head = head.next;
            while(array[i]!=0&&head!=null){
                ListNode n = new ListNode(head.val);
                temp.next = n;
                temp = temp.next;
                array[i]--;
                head = head.next;
            }
            result[i] = node;
        }
        return result;
        
        
    }

}
