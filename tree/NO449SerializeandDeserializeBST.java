package pers.jiahao.leetcode.tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NO449SerializeandDeserializeBST {
	public class Codec {

	    // Encodes a tree to a single string.
	    public String serialize(TreeNode root) {
	        StringBuffer str = new StringBuffer();
	        preorder(root,str);
	        return str.toString();
	        
	    }

	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	        if(data.length()==0){
	            return null;
	        }
	        String[] array = data.split(",");
	        int[] inorder = new int[array.length];
	        for(int i = 0;i<array.length;i++){
	            inorder[i] = Integer.parseInt(array[i]);
	        }
	        int[] preorder = new int[array.length];
	        for(int i = 0;i<array.length;i++){
	            preorder[i] = inorder[i];
	        }
	        Arrays.sort(inorder);
	        TreeNode root = new TreeNode(preorder[0]);
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i = 0;i<inorder.length;i++){
	            map.put(inorder[i],i);
	        }
	        Stack<TreeNode> stack = new Stack<>();
	        stack.push(root);
	        for(int i = 1;i<preorder.length;i++){
	            int value = preorder[i];
	            TreeNode node = new TreeNode(value);
	            if(map.get(value)<map.get(stack.peek().val)){
	                TreeNode parent = stack.peek();
	                parent.left = node;
	            }else{
	                TreeNode parent = null;
	                while(!stack.empty()&&map.get(value)>map.get(stack.peek().val)){
	                    parent = stack.pop();
	                }
	                parent.right = node;
	            }
	            stack.push(node);
	        }
	        return root;
	    }
	    private void preorder(TreeNode root, StringBuffer str){
	        if(root==null){
	            return;
	        }
	        str.append(root.val+",");
	        preorder(root.left,str);
	        preorder(root.right,str);
	    }
	}

}
