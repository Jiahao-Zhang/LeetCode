package pers.jiahao.leetcode.tree;

public class NO108ConvertSortedArraytoBinarySearchTree {
	 public TreeNode sortedArrayToBST(int[] nums) {
	        if(nums==null||nums.length==0){
	            return null;
	        }
	        int left = 0;
	        int right = nums.length-1;
	        int mid = (left+right)/2;
	        return create(nums,mid,left,right);
	        
	        
	    }
	    public TreeNode create(int[] nums,int mid,int left,int right){
	        TreeNode root = new TreeNode(nums[mid]);
	        if(left>right){
	            return null;
	        }
	        root.left = create(nums,(left+mid-1)/2,left,mid-1);
	        root.right = create(nums,(right+mid+1)/2,mid+1,right);
	        return root;
	    }

}
