package pers.jiahao.leetcode.tree;

public class NO104MaximumDepthofBinaryTree {
	 int depth = 0;
	    public int maxDepth(TreeNode root) {
	        getDepth(root,1);
	        return depth;
	    }
	    public void getDepth(TreeNode root,int start){
	        if(root==null){
	            if(start-1>depth){
	                depth = start-1;
	            }
	            return;
	        }
	        getDepth(root.left,start+1);
	        getDepth(root.right,start+1);
	    }

}
