package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO530MinimumAbsoluteDifferenceinBST {
	int min = Integer.MAX_VALUE;
    int prev = -1;
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root);
        return min;
    }
     public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
         if(prev!=-1){
             min = Math.min(min,Math.abs(root.val-prev));
         }
        
        prev = root.val;
        dfs(root.right);
        
    }

}
