package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NO107BinaryTreeLevelOrderTraversalII {
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        LinkedList<List<Integer>> result = new LinkedList<>();
	        if(root==null){
	            return result;
	        }    
	        levelorder(root,0,result);
	        return result;
	        
	    }
	    public void levelorder(TreeNode root, int level, LinkedList<List<Integer>> list){
	        if(root==null){
	            return;
	        }
	        if(level>=list.size()){
	            List<Integer> temp = new ArrayList<>();
	            temp.add(root.val);
	            list.addFirst(temp);
	        }else{
	            list.get(list.size()-level-1).add(root.val);
	        }
	        levelorder(root.left,level+1,list);
	        levelorder(root.right,level+1,list);
	    }

}
