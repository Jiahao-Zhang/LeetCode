package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO783MinimumDistanceBetweenBSTNodes {
	public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<list.size();i++){
            min = Math.min(min,list.get(i)-list.get(i-1));
        }
        return min;
    }
    public void dfs(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
        
    }

}
