package pers.jiahao.leetcode.tree;

import java.util.Stack;

public class NO297SerializeandDeserializeBinaryTree {
	 // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer buffer = new StringBuffer();
        buildString(root,buffer);
        System.out.println(buffer.toString());
        return buffer.toString();
        
    }
    private void buildString(TreeNode root,StringBuffer buffer){
        if(root==null){
            buffer.append("X").append(",");
            return;
        }
        buffer.append(root.val).append(",");
        buildString(root.left,buffer);
        buildString(root.right,buffer);
    }
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] dataArray = data.split(",");
        Stack<String> stack = new Stack<>();
        for(int i = dataArray.length-1;i>=0;i--){
            stack.push(dataArray[i]);
        }
        return buildTree(stack);
    }
    private TreeNode buildTree(Stack<String> stack){
        String data = stack.pop();
        if(data.equals("X")){
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(data));
        node.left = buildTree(stack);
        node.right = buildTree(stack);
        return node;
    }

}
