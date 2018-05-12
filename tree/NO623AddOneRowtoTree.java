package pers.jiahao.leetcode.tree;

public class NO623AddOneRowtoTree {
	 public TreeNode addOneRow(TreeNode root, int v, int d) {
	        if(d==1){
	          TreeNode node = new TreeNode(v);
	          node.left = root;
	          return node;
	        }
	        dfs(root.left,root,v,d,2,true);
	        dfs(root.right,root,v,d,2,false);
	        return root;
	      
	        
	    }
	    public void dfs(TreeNode node,TreeNode parent,int v, int d,int depthNow,boolean isLeft){
	          if(node==null){
	              if(depthNow==d&&isLeft){
	                   TreeNode node1 = new TreeNode(v);
	                   node1.left = parent.left;
	                   parent.left = node1;
	              }else if(depthNow==d&&!isLeft){
	                   TreeNode node1 = new TreeNode(v);
	                   node1.right = parent.right;
	                    parent.right = node1;
	                }
	              return;
	          }
	          if(depthNow==d&&isLeft){
	              TreeNode node1 = new TreeNode(v);
	              node1.left = parent.left;
	              parent.left = node1;
	              return;
	          }else if(depthNow==d&&!isLeft){
	              TreeNode node1 = new TreeNode(v);
	              node1.right = parent.right;
	              parent.right = node1;
	              return;
	          }
	          dfs(node.left,node,v,d,depthNow+1,true);
	          dfs(node.right,node,v,d,depthNow+1,false);
	      
	    }

}
