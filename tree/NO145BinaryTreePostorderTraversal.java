package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class NO145BinaryTreePostorderTraversal {
	 public List<Integer> postorderTraversal(TreeNode root) {
	        List<Integer> result = new ArrayList<>();
	        if(root==null){
	            return result;
	        }
	        Stack<TreeNode> stack = new Stack<>();
	        HashSet<TreeNode> set = new HashSet<>();
	        stack.push(root);
	        while(true){
	            if(root.left!=null&&root.right==null){
	                if(set.contains(root.left)){
	                    result.add(root.val);
	                    set.add(root);
	                    stack.pop();
	                }else{
	                    stack.push(root.left);
	                }
	             
	            }else if(root.left!=null&&root.right!=null){
	                if(set.contains(root.left)&&set.contains(root.right)){
	                    result.add(root.val);
	                    set.add(root);
	                    stack.pop();
	                }else if(!set.contains(root.left)&&!set.contains(root.right)){
	                    stack.push(root.left);
	                }else if(set.contains(root.left)&&!set.contains(root.right)){
	                    stack.push(root.right);
	                }  
	            }else if(root.left==null&&root.right==null){
	                result.add(root.val);
	                set.add(root);
	                stack.pop();
	            }else{
	                if(set.contains(root.right)){
	                    result.add(root.val);
	                    set.add(root);
	                    stack.pop();
	                }else{
	                    stack.push(root.right);
	                }
	            }
	            if(stack.empty()){
	                break;
	            }else{
	                root = stack.peek();
	            }
	            
	        }
	        return result;
	        
	    }

}
