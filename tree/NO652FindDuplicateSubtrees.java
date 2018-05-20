package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NO652FindDuplicateSubtrees {
	 public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
	        List<TreeNode> result = new ArrayList<>();
	        HashMap<String,Integer> map = new HashMap<>();
	        dfs(root,result,map);
	        return result;
	    }
	    private String dfs(TreeNode root,List<TreeNode> result, HashMap<String,Integer> map){
	        if(root==null){
	            return "";
	        }
	        String serial = root.val+","+dfs(root.left,result,map)+","+dfs(root.right,result,map);
	        if(map.getOrDefault(serial,0)==1){
	            result.add(root);
	        }
	        map.put(serial,map.getOrDefault(serial,0)+1);
	        return serial;
	    }

}
