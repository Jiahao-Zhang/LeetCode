package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO199BinaryTreeRightSideView {
	 public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> result = new ArrayList<>();
	        if(root==null){
	            return result;
	        }
	        List<List<Integer>> temp = new ArrayList<>();
	        levelorder(root,temp,0);
	        for(int i = 0;i<temp.size();i++){
	            result.add(temp.get(i).get(0));
	        }
	        return result;
	        
	    }
	    public void levelorder(TreeNode root, List<List<Integer>> list,int level){
	        if(root==null){
	            return;
	        }
	        if(level>=list.size()){
	            List<Integer> temp = new ArrayList<>();
	            temp.add(root.val);
	            list.add(temp);
	        }else{
	            list.get(level).add(root.val);
	        }
	        levelorder(root.right,list,level+1);
	        levelorder(root.left,list,level+1);
	    }

}
