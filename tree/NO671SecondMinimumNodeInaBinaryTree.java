package pers.jiahao.leetcode.tree;

public class NO671SecondMinimumNodeInaBinaryTree {
	 public int findSecondMinimumValue(TreeNode root) {
	        if(root.left==null&&root.right==null){
	            return -1;
	        }
	        int left = root.left.val;
	        int right = root.right.val;
	        if(left==root.val){
	            left = findSecondMinimumValue(root.left);
	        }
	        if(right==root.val){
	            right = findSecondMinimumValue(root.right);
	        }
	        if(left!=-1&&right!=-1){
	            return Math.min(left,right);
	        }else if(left!=-1){
	            return left;
	        }else{
	            return right;
	        }
	        
	    }

}
