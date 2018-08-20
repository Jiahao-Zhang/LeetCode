package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO590NaryTreePostorderTraversal {
	public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        helper(list,root);
        return list;
        
        
    }
    private void helper(List<Integer> list, Node root){
        if(root==null){
            return;
        }
        for(int i = 0;i<root.children.size();i++){
            helper(list,root.children.get(i));
        }
        list.add(root.val);
    }

}
