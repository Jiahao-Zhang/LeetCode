package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO114FlattenBinaryTreetoLinkedList {
	 public void flatten(TreeNode root) {
	        if(root==null){
	            return;
	        }
	        List<TreeNode> list = new ArrayList<>();
	        preorder(root,list);
	        root.right = null;
	        root.left = null;
	        TreeNode temp = root;
	        for(int i=1;i<list.size();i++){
	            list.get(i).right = null;
	            list.get(i).left = null;
	            temp.right = list.get(i);
	            temp = temp.right;
	        }
	        
	    }
	    private void preorder(TreeNode root,List<TreeNode> list){
	        if(root==null){
	            return;
	        }
	        list.add(root);
	        preorder(root.left,list);
	        preorder(root.right,list);
	    }

}
