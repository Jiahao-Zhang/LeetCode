package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO662MaximumWidthofBinaryTree {
	 public int widthOfBinaryTree(TreeNode root) {
	        return dfs(root,0,1,new ArrayList<Integer>(),new ArrayList<Integer>());
	        
	    }
	    private int dfs(TreeNode root,int level,int location, List<Integer> start,List<Integer> end){
	        if(root==null){
	            return 0;
	        }
	        if(start.size()==level){
	            start.add(location);
	            end.add(location);
	        }else{
	            end.set(level,location);
	        }
	        int width = end.get(level)-start.get(level)+1;
	        int left = dfs(root.left,level+1,2*location,start,end);
	        int right = dfs(root.right,level+1,2*location+1,start,end);
	        return Math.max(width,Math.max(left,right));
	    }

}
