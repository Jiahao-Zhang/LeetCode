package pers.jiahao.leetcode.tree;

public class NO669TrimaBinarySearchTree {
	public TreeNode trimBST(TreeNode root, int L, int R) {
        return trim(root,L,R);
    }
    public TreeNode trim(TreeNode root, int L, int R){
        TreeNode node = null;
        if(root==null){
            return node;
        }
        if(root.val<L){
            node = trim(root.right,L,R);
        }else if(root.val>R){
            node = trim(root.left,L,R);
        }else{
            node = new TreeNode(root.val);
            node.left = trim(root.left,L,R);
            node.right = trim(root.right,L,R);
        }
        return node;
    }

}
