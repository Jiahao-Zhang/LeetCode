package pers.jiahao.leetcode.tree;

public class NO110BalancedBinaryTree {
	 public boolean isBalanced(TreeNode root) {
	        if(root==null){
	            return true;
	        }
	        int leftHeight = getHeight(root.left,1);
	        int rightHeight = getHeight(root.right,1);
	        if(Math.abs(leftHeight-rightHeight)>1){
	            return false;
	        }else{
	            return isBalanced(root.left)&&isBalanced(root.right);
	        } 
	    }
	    private int getHeight(TreeNode root,int height){
	        if(root==null){
	            return height-1;
	        }
	        int left = getHeight(root.left,height+1);
	        int right = getHeight(root.right,height+1);
	        return Math.max(left,right);
	    }

}
