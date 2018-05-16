package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO257BinaryTreePaths {
	 public List<String> binaryTreePaths(TreeNode root) {
	        List<String> result = new ArrayList<>();
	        if(root==null){
	            return result;
	        }
	        List<Integer> list = new ArrayList<>();
	        backtrack(root,list,result);
	        return result;
	        
	    }
	    public void backtrack(TreeNode root, List<Integer> list, List<String> result){
	        if(root==null){
	            return;
	        }
	        if(root.left==null&&root.right==null){
	            StringBuffer buffer = new StringBuffer();
	            for(int i = 0;i<list.size();i++){
	                buffer.append(list.get(i)+"->");
	            }
	            buffer.append(root.val+"");
	            result.add(buffer.toString());
	            return;
	        }
	        list.add(root.val);
	        backtrack(root.left,list,result);
	        backtrack(root.right,list,result);
	        list.remove(list.size()-1);
	    }

}
