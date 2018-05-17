package pers.jiahao.leetcode.tree;

public class NO572SubtreeofAnotherTree {
	 public boolean isSubtree(TreeNode s, TreeNode t) {
	        return preorder(s,t);
	    }
	    private boolean preorder(TreeNode s, TreeNode t){
	        if(s==null&&t==null){
	            return true;
	        }else if(s==null&&t!=null){
	            return false;
	        }
	        if(isEqual(s,t)){
	            return true;
	        }else{
	            return preorder(s.left,t)||preorder(s.right,t);
	        }
	    }
	    private boolean isEqual(TreeNode s, TreeNode t){
	        if(s==null&&t==null){
	            return true;
	        }else if(s==null&&t!=null){
	            return false;
	        }else if(s!=null&&t==null){
	            return false;
	        }else{
	            if(s.val==t.val){
	                return isEqual(s.left,t.left)&&isEqual(s.right,t.right);
	            }else{
	                return false;
	            }
	        }
	    }

}
