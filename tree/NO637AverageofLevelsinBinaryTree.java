package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NO637AverageofLevelsinBinaryTree {
	 public List<Double> averageOfLevels(TreeNode root) {
	        HashMap<Integer,Double> map = new HashMap<>();
	        HashMap<Integer,Integer> map2 = new HashMap<>();
	        inorder(root,map,map2,0);
	        Iterator<Map.Entry<Integer,Double>> it = map.entrySet().iterator();
	        List<Double> list = new ArrayList<>();
	        while(it.hasNext()){
	            Map.Entry<Integer,Double> entry = it.next();
	            list.add(entry.getValue()/map2.get(entry.getKey()));
	        }
	        return list;
	        
	    }
	    private void inorder(TreeNode root, HashMap<Integer,Double> map,HashMap<Integer,Integer> map2,int level){
	        if(root==null){
	            return;
	        }
	        inorder(root.left,map,map2,level+1);
	        map.put(level,map.getOrDefault(level,0.0)+root.val);
	        map2.put(level,map2.getOrDefault(level,0)+1);
	        inorder(root.right,map,map2,level+1);
	    }

}
