package pers.jiahao.leetcode.tree;

public class NO814BinaryTreePruning {
	  public TreeNode pruneTree(TreeNode root) {
	        if(root == null){
	            return null;
	        }
	        root.left = pruneTree(root.left);
	        root.right = pruneTree(root.right);
	        if(root.val==0&&root.left==null&&root.right==null){
	            return null;
	        }
	        return root;
	    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
