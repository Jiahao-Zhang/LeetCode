package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO101SymmetricTree {
	 public boolean isSymmetric(TreeNode root) {
	        List<List<Integer>> list = new ArrayList<>();
	        if(root==null){
	            return true;
	        }
	        levelorder(root,list,0);
	        for(int i = 0;i<list.size();i++){
	            int left = 0;
	            int right = list.get(i).size()-1;
	            while(left<right){
	                if(list.get(i).get(left)!=list.get(i).get(right)){
	                    return false;
	                }
	                left++;
	                right--;
	            }
	        }
	        return true;
	        
	        
	    }
	    public void levelorder(TreeNode root, List<List<Integer>> list,int level){
	        if(root==null){
	            if(level>=list.size()){
	                List<Integer> temp = new ArrayList<>();
	                temp.add(null);
	                list.add(temp);
	            }else{
	                list.get(level).add(null);
	            }
	            return;
	        }
	         if(level>=list.size()){
	            List<Integer> temp = new ArrayList<>();
	            temp.add(root.val);
	            list.add(temp);
	        }else{
	            list.get(level).add(root.val);
	        }
	        levelorder(root.left,list,level+1);
	        levelorder(root.right,list,level+1);
	    }

}
