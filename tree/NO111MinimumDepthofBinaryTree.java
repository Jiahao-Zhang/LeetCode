package pers.jiahao.leetcode.tree;

public class NO111MinimumDepthofBinaryTree {
	 public int minDepth(TreeNode root) {
	        if(root==null){
	            return 0;
	        }
	        return dfs(root,1);
	    }
	    private int dfs(TreeNode node, int depth){
	        if(node==null){
	            return depth-1;
	        }
	        int left = 0, right = 0;
	        if(node.left!=null&&node.right!=null){
	            left = dfs(node.left,depth+1);
	            right = dfs(node.right,depth+1);
	            return Math.min(left,right);
	        }else if(node.left!=null){
	            return dfs(node.left,depth+1);
	        }else if(node.right!=null){
	            return dfs(node.right,depth+1);
	        }else{
	            return depth;
	        }
	    }

}
