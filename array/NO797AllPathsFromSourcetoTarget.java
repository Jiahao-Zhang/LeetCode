package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class NO797AllPathsFromSourcetoTarget {
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        if(graph==null||graph.length==0||graph[0].length==0){
            return result;
        }
        int n = graph.length-1;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        backtrack(result,list,graph[0],0,n,graph);
        return result;
        
    }
    private void backtrack(List<List<Integer>> result,List<Integer> list,int[] choices,int startIndex,int n,int[][] graph){
        if(choices.length==0){
            return;
        }
        for(int i = startIndex;i<choices.length;i++){
            list.add(choices[i]);
            if(choices[i]==n){
                result.add(new ArrayList(list));
                list.remove(list.size()-1);
                continue;
            }
            backtrack(result,list,graph[choices[i]],0,n,graph);
            list.remove(list.size()-1);
        }
    }

}
