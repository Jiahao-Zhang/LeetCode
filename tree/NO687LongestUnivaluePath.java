package pers.jiahao.leetcode.tree;

public class NO687LongestUnivaluePath {
	 int len = 0;
	    public int longestUnivaluePath(TreeNode root) {
	        if(root==null){
	            return 0;
	        }
	        helper(root,-1);
	        return len;
	    }
	    private int helper(TreeNode node,int val){
	        if(node==null){
	            return 0;
	        }
	        int left = helper(node.left,node.val);
	        int right = helper(node.right,node.val);
	        len = Math.max(len,left+right);
	        int count = 0;
	        if(val==node.val)
	            count = Math.max(left,right)+1;
	        return count;
	    }

}
