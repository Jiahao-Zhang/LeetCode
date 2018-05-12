package pers.jiahao.leetcode.tree;

import java.util.ArrayList;

public class NO230KthSmallestElementinaBST {
	 public int kthSmallest(TreeNode root, int k) {
	       
	        ArrayList<Integer> list = new ArrayList<>();
	        inorder(root,list);
	        return list.get(k-1);
	    }
	    private void inorder(TreeNode root,ArrayList<Integer> list){
	        if(root==null){
	            return;
	        }
	        inorder(root.left,list);
	        list.add(root.val);
	        inorder(root.right,list);
	    }

}
