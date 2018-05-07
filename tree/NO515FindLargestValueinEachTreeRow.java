package pers.jiahao.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NO515FindLargestValueinEachTreeRow {
	int TreeLevel = 0;
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        inOrder(root,map,0);
        for(int i = 0;i<=TreeLevel;i++){
            list.add(map.get(i));
        }
        return list;   
    }
    public void inOrder(TreeNode node,HashMap<Integer,Integer> map,int level){
        if(node==null){
            if(level-1>=TreeLevel){
                TreeLevel = level-1;
            }
            return;
        }
        inOrder(node.left,map,level+1);
        if(map.containsKey(level)){
            if(map.get(level)<node.val){
                map.put(level,node.val);
            }
        }else{
            map.put(level,node.val);
        }
        inOrder(node.right,map,level+1);
    }

}
