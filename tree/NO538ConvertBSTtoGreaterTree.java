package pers.jiahao.leetcode.tree;

public class NO538ConvertBSTtoGreaterTree {
	  public TreeNode convertBST(TreeNode root) {
	        if(root==null){
	            return null;
	        }
	        int[] sum = new int[1];
	        dfs(root, sum);
	        return root;
	    }
	    public void dfs(TreeNode root, int[] sum){
	        if(root==null){
	            return;
	        }
	        dfs(root.right,sum);
	        sum[0]+=root.val;
	        root.val=sum[0];
	        dfs(root.left,sum);
	    }

}
