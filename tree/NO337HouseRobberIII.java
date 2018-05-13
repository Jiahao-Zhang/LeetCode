package pers.jiahao.leetcode.tree;

public class NO337HouseRobberIII {
	 public int rob(TreeNode root) {
	        int[] val = dfs(root);
	        return Math.max(val[0],val[1]);
	    }
	    public int[] dfs(TreeNode root){
	        if(root==null){
	            return new int[2];
	        }
	        int[] rootVal = new int[2];
	        int[] left = dfs(root.left);
	        int[] right = dfs(root.right);
	        rootVal[0] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
	        rootVal[1] = root.val+left[0]+right[0];
	        return rootVal;
	    }

}
