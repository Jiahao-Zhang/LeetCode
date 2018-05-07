package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NO508MostFrequentSubtreeSum {
	 public int[] findFrequentTreeSum(TreeNode root) {
	        if(root==null){
	            return new int[]{};
	        }
	        Map<Integer, Integer> map = new HashMap<>();
	        getSum(root,map);
	        Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
	        int max = 0;
	        ArrayList<Integer> list = new ArrayList<>();
	        while(it.hasNext()){
	            Map.Entry<Integer,Integer> entry = it.next();
	            if(entry.getValue()>max){
	                list = new ArrayList<>();
	                max = entry.getValue();
	                list.add(entry.getKey());
	            }else if(entry.getValue()==max){
	                list.add(entry.getKey());
	            }
	        }
	        int[] result = new int[list.size()];
	        for(int i = 0;i<list.size();i++){
	            result[i] = list.get(i);
	        }
	        return result;
	        
	    }
	    public int getSum(TreeNode root, Map<Integer,Integer> map){
	        if(root.left==null&&root.right!=null){
	            root.val = getSum(root.right,map)+root.val;
	        }else if(root.right==null&&root.left!=null){
	            root.val = getSum(root.left,map)+root.val;
	        }else if(root.left==null&&root.left==null){
	            root.val = root.val;
	        }else{
	            root.val = getSum(root.left,map)+getSum(root.right,map)+root.val;
	        }
	        if(map.containsKey(root.val)){
	            int count = map.get(root.val)+1;
	            map.remove(root.val);
	            map.put(root.val,count);
	        }else{
	            map.put(root.val,1);
	        }
	        return root.val;
	        
	    }

}
