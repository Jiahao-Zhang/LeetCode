package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO113PathSumII {
	 public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        List<List<Integer>> result = new ArrayList<>();
	        dfs(root,sum,0,result,new ArrayList<Integer>());
	        return result;
	    }
	    private void dfs(TreeNode cur,int target,int curSum,List<List<Integer>> result,List<Integer> list){
	        if(cur==null){
	            return;
	        }
	        curSum+=cur.val;
	        list.add(cur.val);
	        if(cur.left==null&&cur.right==null){
	            if(curSum==target){
	                result.add(new ArrayList(list));
	            }
	        }
	        dfs(cur.left,target,curSum,result,list);
	        dfs(cur.right,target,curSum,result,list);
	        curSum-=list.get(list.size()-1);
	        list.remove(list.size()-1);
	    }

}
