package pers.jiahao.leetcode.tree;

public class NO513FindBottomLeftTreeValue {
	 int bottomValue = 0;
	    int bottomLevel = 0;
	    public int findBottomLeftValue(TreeNode root) {
	        bottomValue = root.val;
	        inorder(root,null,0);
	        return bottomValue;
	    }
	    private void inorder(TreeNode node,TreeNode parent,int level){
	        if(node==null){
	            if(level-1>bottomLevel){
	                bottomValue = parent.val;
	                bottomLevel = level-1;
	            }
	            return;
	        }
	        inorder(node.left,node,level+1);
	        inorder(node.right,node,level+1);
	        
	    }
	

}
