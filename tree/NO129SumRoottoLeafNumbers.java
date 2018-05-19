package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO129SumRoottoLeafNumbers {
	 public int sumNumbers(TreeNode root) {
	        if(root==null){
	            return 0;
	        }
	        List<Integer> list = new ArrayList<>();
	        String str = new String();
	        dfs(root,list,str);
	        int sum = 0;
	        for(int i = 0;i<list.size();i++){
	            sum+=list.get(i);
	        }
	        return sum;
	        
	    }
	    private void dfs(TreeNode root, List<Integer> list,String str){
	        if(root==null){
	            return;
	        }
	        str = str+root.val;
	        if(root.left==null&&root.right==null){
	            list.add(Integer.parseInt(str));
	            return;
	        }
	        dfs(root.left,list,str);
	        dfs(root.right,list,str);
	        str = str.substring(0,str.length()-1);
	    }

}
