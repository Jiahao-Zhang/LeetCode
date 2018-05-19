package pers.jiahao.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

public class NO103BinaryTreeZigzagLevelOrderTraversal {
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        LinkedList<LinkedList<Integer>> result = new LinkedList<>();
	        dfs(root,result,0);
	        List<List<Integer>> list = new ArrayList(result);
	        return list;
	        
	    }
	    private void dfs(TreeNode root,LinkedList<LinkedList<Integer>> result,int level){
	        if(root==null){
	            return;
	        }
	        if(level>=result.size()){
	            LinkedList<Integer> list = new LinkedList();
	            list.add(root.val);
	            result.add(list);
	        }else{
	            if(level%2==0){
	                result.get(level).add(root.val);
	            }else{
	                result.get(level).addFirst(root.val);
	            }
	        }
	        dfs(root.left,result,level+1);
	        dfs(root.right,result,level+1);
	        
	    }

}
