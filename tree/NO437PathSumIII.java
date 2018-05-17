package pers.jiahao.leetcode.tree;

import java.util.HashMap;

public class NO437PathSumIII {
	 public int pathSum(TreeNode root, int sum) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        map.put(0,1);
	        return helper(root,0,sum,map);
	    }
	    private int helper(TreeNode root, int curSum,int target,HashMap<Integer,Integer> map){
	        if(root==null){
	            return 0;
	        }
	        curSum+=root.val;
	        int count = map.getOrDefault(curSum-target,0);
	        map.put(curSum,map.getOrDefault(curSum,0)+1);
	        count+=helper(root.left,curSum,target,map)+helper(root.right,curSum,target,map);
	        map.put(curSum,map.get(curSum)-1);//回溯
	        return count;
	    }

}
