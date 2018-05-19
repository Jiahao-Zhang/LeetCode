package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NO501FindModeinBinarySearchTree {
	 public int[] findMode(TreeNode root) {
	        if(root==null){
	            int[] result ={};
	            return result;
	        }
	        HashMap<Integer,Integer> map = new HashMap<>();
	        dfs(root,map);
	        int max = 0;
	        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
	            if(entry.getValue()>=max){
	                max = entry.getValue();
	            }
	        }
	        ArrayList<Integer> list = new ArrayList<>();
	        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
	            if(entry.getValue()==max){
	                list.add(entry.getKey());
	            }
	        }
	        int[] result = new int[list.size()];
	        for(int i = 0;i<list.size();i++){
	            result[i] = list.get(i);
	        }
	        return result;
	        
	    }
	    private void dfs(TreeNode root,HashMap<Integer,Integer> map){
	        if(root==null){
	            return;
	        }
	        map.put(root.val,map.getOrDefault(root.val,0)+1);
	        dfs(root.left,map);
	        dfs(root.right,map);
	    }

}
