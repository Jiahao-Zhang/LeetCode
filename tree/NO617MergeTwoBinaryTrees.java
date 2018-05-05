package pers.jiahao.leetcode.tree;

public class NO617MergeTwoBinaryTrees {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return merge(t1,t2);
    }
    public TreeNode merge(TreeNode t1,TreeNode t2){
        TreeNode node = null;
        if(t1!=null&&t2!=null){
            node = new TreeNode(t1.val+t2.val);
            node.left = merge(t1.left,t2.left);
            node.right = merge(t1.right,t2.right);
        }else if(t1==null&&t2!=null){
            node = new TreeNode(t2.val);
            node.left = merge(null,t2.left);
            node.right = merge(null,t2.right);
        }else if(t1!=null&&t2==null){
            node = new TreeNode(t1.val);
            node.left = merge(t1.left,null);
            node.right = merge(t1.right,null);
        }
        return node;
        
    }

}
