package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO102BinaryTreeLevelOrderTraversal {
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<>();
	        preorder(result,root,0);
	        return result;
	    }
	    private void preorder(List<List<Integer>> result,TreeNode root,int level){
	        if(root==null){
	            return;
	        }
	        if(result.size()==0||level>=result.size()){
	            List<Integer> list = new ArrayList<>();
	            list.add(root.val);
	            result.add(list);
	        }else{
	            result.get(level).add(root.val);
	        }
	        preorder(result,root.left,level+1);
	        preorder(result,root.right,level+1);
	    }

}
