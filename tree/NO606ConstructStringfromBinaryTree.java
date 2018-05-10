package pers.jiahao.leetcode.tree;

public class NO606ConstructStringfromBinaryTree {
	 public String tree2str(TreeNode t) {
	        StringBuffer result = new StringBuffer();
	        if(t==null){
	            return result.toString();
	        }
	        if(t.left==null&&t.right==null){
	            result.append(t.val+"");
	        }else if(t.left!=null&&t.right==null){
	            result.append(t.val+"");
	            preorder(t.left,result);
	        }else if(t.right!=null&&t.left==null){
	            result.append(t.val+"()");
	            preorder(t.right,result);
	        }else{
	            result.append(t.val+"");
	            preorder(t.left,result);
	            preorder(t.right,result);
	        }
	        
	        return result.toString();
	        
	    }
	    public void preorder(TreeNode node,StringBuffer str){
	        if(node.left==null&&node.right==null){
	            str.append("("+node.val+")");
	            return;
	        }
	        if(node.left!=null&&node.right==null){
	            str.append("("+node.val);
	            preorder(node.left,str);
	            str.append(")");
	        }else if(node.left==null&&node.right!=null){
	            str.append("("+node.val+"()");
	            preorder(node.right,str);
	            str.append(")");
	        }else if(node.left!=null&&node.right!=null){
	            str.append("("+node.val);
	            preorder(node.left,str);
	            preorder(node.right,str);
	            str.append(")");
	        }
	        
	    }

}
