package pers.jiahao.leetcode.tree;

import java.util.List;

public class NO559MaximumDepthofNaryTree {
	int max = 0;
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        dfs(root,1);
        return max;
    }
    private void dfs(Node root,int depth){
        if(root==null){
            return;
        }
        for(int i = 0;i<root.children.size();i++){
            dfs(root.children.get(i),depth+1);
        }
        max = Math.max(depth,max);
    }

}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
