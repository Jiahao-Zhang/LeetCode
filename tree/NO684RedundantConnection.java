package pers.jiahao.leetcode.tree;

public class NO684RedundantConnection {
	 public int[] findRedundantConnection(int[][] edges) {
	        int[] parent = new int[1001];
	        for(int i = 0;i<1001;i++){
	            parent[i] = i;
	        }
	        for(int i = 0;i<edges.length;i++){
	            int node1 = edges[i][0];
	            int node2 = edges[i][1];
	            if(find(parent,node1)==find(parent,node2)){
	                return edges[i];
	            }else{
	                parent[find(parent,node1)] = find(parent,node2);
	            }
	        }
	        return new int[2];
	        
	    }
	    private int find(int[] parent, int node){
	        if(node!=parent[node]){
	            parent[node] = find(parent,parent[node]);
	        }
	        return parent[node];
	    }

}
