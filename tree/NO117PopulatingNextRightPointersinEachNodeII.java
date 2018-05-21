package pers.jiahao.leetcode.tree;

public class NO117PopulatingNextRightPointersinEachNodeII {
	 public void connect(TreeLinkNode root) {
	        TreeLinkNode head = new TreeLinkNode(0);
	        TreeLinkNode pre = head;
	        while(root!=null){
	            if(root.left!=null){
	                pre.next = root.left;
	                pre = pre.next;
	            }
	            if(root.right!=null){
	                pre.next = root.right;
	                pre = pre.next;
	            }
	            root = root.next;
	            if(root==null){
	                pre = head;
	                root = head.next;
	                head.next = null;
	            }
	        }
	    }

}
