package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO655PrintBinaryTree {
	 public List<List<String>> printTree(TreeNode root) {
	        List<List<String>> container = new ArrayList<>();
	        List<String> list = new ArrayList<>();
	        if(root==null){
	            return container;
	        }
	        int height = getHeight(root);
	        int number = (int)(Math.pow(2,height)-1);
	        for(int i = 0;i<number;i++){
	           list.add("");
	        }
	        for(int i = 0;i<height;i++){
	            container.add(new ArrayList(list));
	        }
	        dfs(root,container,0,0,number-1);
	        return container;
	    }
	    public int getHeight(TreeNode root){
	     
	        if(root == null){
	            return 0;
	        }
	        int leftMax = getHeight(root.left);
	        int rightMax = getHeight(root.right);
	        if(leftMax>rightMax){
	            return leftMax+1;
	        }else{
	            return rightMax+1;
	        }
	    }
	    public void dfs(TreeNode root, List<List<String>> container, int row, int left, int right){
	        if(root==null){
	            return;
	        }
	        container.get(row).set((left+right)/2,String.valueOf(root.val));
	        dfs(root.left,container,row+1,left,(left+right)/2-1);
	        dfs(root.right,container,row+1,(left+right)/2+1,right);
	    }

}
