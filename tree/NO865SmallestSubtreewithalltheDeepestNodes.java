package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NO865SmallestSubtreewithalltheDeepestNodes {
	public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null){
            return null;
        }
        List<TreeNode> list = new ArrayList<>();
        List<List<TreeNode>> container = new ArrayList<>();
        dfs(container,root,list);
        int maxSize = container.get(0).size();
        List<List<TreeNode>> container2 = new ArrayList<>();
        container2.add(container.get(0));
        for(int i = 1;i<container.size();i++){
            int size = container.get(i).size();
            if(size>maxSize){
                maxSize = size;
                container2.clear();
                container2.add(container.get(i));
            }else if(size==maxSize){
                container2.add(container.get(i));
            }
        }
        int index = maxSize-1;
        for(int i = 0;i<container2.size()-1;i++){
            if(container2.get(i).get(index)!=container2.get(i+1).get(index)){
                i = -1;
                index--;
            }
        }
        return container2.get(0).get(index);
        
    }
    private void dfs(List<List<TreeNode>> container,TreeNode root,List<TreeNode> list){
        if(root==null){
            container.add(new ArrayList(list));
            return;
        }
        list.add(root);
        dfs(container,root.left,list);
        dfs(container,root.right,list);
        list.remove(list.size()-1);
        
        
    }

}
