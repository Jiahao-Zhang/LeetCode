package pers.jiahao.leetcode.tree;

public class NO543DiameterofBinaryTree {
	 int max = 0;
	    public int diameterOfBinaryTree(TreeNode root) {
	        if(root==null){
	            return 0;
	        }
	        getDepth(root);
	        return max;
	        
	    }
	   
	    public int getDepth(TreeNode root){
	        if(root==null){
	            return 0;
	        }
	        int left = getDepth(root.left);
	        int right = getDepth(root.right);
	        max = Math.max(max,left+right);
	        return Math.max(left,right)+1;
	        
	    }

}
