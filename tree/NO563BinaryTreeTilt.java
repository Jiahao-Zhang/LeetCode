package pers.jiahao.leetcode.tree;

public class NO563BinaryTreeTilt {
	 int result =0;
	    public int findTilt(TreeNode root) {
	        dfs(root);
	        return result;
	        
	    }
	    public int dfs(TreeNode root){
	        if(root==null){
	            return 0;
	        }
	        int left = dfs(root.left);
	        int right = dfs(root.right);
	        result+=Math.abs(left-right);
	        return left+right+root.val;
	      
	    }

}
