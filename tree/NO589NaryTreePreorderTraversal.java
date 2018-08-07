package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO589NaryTreePreorderTraversal {
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	class Solution {
	    public List<Integer> preorder(Node root) {
	        List<Integer> result = new ArrayList<>();
	        helper(result,root);
	        return result;
	    }
	    private void helper(List<Integer> list,Node root){
	        if(root==null){
	            return;
	        }
	        list.add(root.val);
	        for(int i = 0;i<root.children.size();i++){
	            helper(list,root.children.get(i));
	        }
	    }
	}

}
