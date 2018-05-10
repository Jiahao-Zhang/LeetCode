package pers.jiahao.leetcode.tree;

public class NO653TwoSumIVInputisaBST {
	 public boolean findTarget(TreeNode root, int k) {
	       return dfs(root,root,k);
	    }
	    public boolean dfs(TreeNode node,TreeNode cur, int value){
	       if(cur==null){
	           return false;
	       }
	       return search(node,cur,value-cur.val)||dfs(node,cur.left,value)||dfs(node,cur.right,value);
	        
	    }
	    public boolean search(TreeNode node, TreeNode cur, int value){
	        if(node==null){
	            return false;
	        }
	        return (value==node.val)&&(node!=cur)
	            ||(value<node.val)&&search(node.right,cur,value)
	            ||(value>node.val)&&search(node.left,cur,value);
	    }

}
