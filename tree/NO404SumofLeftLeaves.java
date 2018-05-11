package pers.jiahao.leetcode.tree;

public class NO404SumofLeftLeaves {
	  public int sumOfLeftLeaves(TreeNode root) {
	        int[] sum = new int[1];
	        boolean isLeftLeave = false;
	        dfs(root, sum,isLeftLeave);
	        return sum[0];
	        
	    }
	    private void dfs(TreeNode root, int[] sum, boolean isLeftLeave){
	        if(root == null){
	            return;
	        }
	        if(root.left==null&&root.right==null&&isLeftLeave){
	            sum[0]+=root.val;
	            return;
	        }
	        dfs(root.left,sum,true);
	        dfs(root.right,sum,false);
	    }

}
