package pers.jiahao.leetcode.tree;

public class NO112PathSum {
	 public boolean hasPathSum(TreeNode root, int sum) {
	        if(root==null){
	            return false;
	        }
	        return dfs(root,sum,0);
	    }
	    private boolean dfs(TreeNode root,int target,int curSum){
	        if(root==null){
	            return false;
	        }
	        curSum+=root.val;
	        if(root.right==null&&root.left==null){
	            if(curSum==target){
	                return true;
	            }
	        }
	        boolean left = dfs(root.left,target,curSum);
	        boolean right = dfs(root.right,target,curSum);
	        curSum-=root.val;
	        return left||right;
	      
	    }

}
