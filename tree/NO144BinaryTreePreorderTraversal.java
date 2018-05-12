package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class NO144BinaryTreePreorderTraversal {
	 public List<Integer> preorderTraversal(TreeNode root) {
	        List<Integer> list = new ArrayList<>();
	        if(root==null){
	            return list;
	        }
	        list.add(root.val);
	        Stack<TreeNode> stack = new Stack<>();
	        HashSet<TreeNode> set = new HashSet<>();
	        stack.push(root);
	        while(true){
	            if(!stack.empty()){
	                TreeNode node = stack.peek();
	                if(node.left!=null&&!set.contains(node.left)){
	                    set.add(node.left);
	                    list.add(node.left.val);
	                    stack.push(node.left);
	         
	                }else{
	                    if(node.right!=null&&!set.contains(node.right)){
	                        list.add(node.right.val);
	                        stack.push(node.right);
	                        set.add(node.right);
	                    }else{
	                        stack.pop();
	                    }
	                }
	            }else{
	                break;
	            }
	        }
	        return list;
	        
	    }

}
