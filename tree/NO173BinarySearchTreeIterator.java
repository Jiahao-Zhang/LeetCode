package pers.jiahao.leetcode.tree;

import java.util.Stack;

public class NO173BinarySearchTreeIterator {
	public class BSTIterator {
	    
	    Stack<TreeNode> stack = new Stack<>();
	    public BSTIterator(TreeNode root) {
	        TreeNode node = root;
	        while(node!=null){
	            stack.push(node);
	            node = node.left;
	        }
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return !stack.empty();
	        
	    }

	    /** @return the next smallest number */
	    public int next() {
	        int result = 0;
	        TreeNode node = stack.pop();
	        result = node.val;
	        node = node.right;
	        while(node!=null){
	            stack.push(node);
	            node = node.left;
	        }
	        return result;
	    }
	}
	

}
