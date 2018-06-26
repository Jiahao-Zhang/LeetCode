package pers.jiahao.leetcode.tp;

import java.util.Arrays;
import java.util.TreeMap;

public class NO826MostProfitAssigningWork {
	public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int sum = 0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(0,0);
        for(int i = 0;i<difficulty.length;i++){
           if(map.containsKey(difficulty[i])){
               map.put(difficulty[i],Math.max(map.get(difficulty[i]),profit[i]));
           }else{
               map.put(difficulty[i],profit[i]);
           }
        }
        Arrays.sort(difficulty);
        for(int i = 0;i<difficulty.length;i++){
            map.put(difficulty[i],Math.max(map.get(difficulty[i]),map.get(map.floorKey(difficulty[i]-1))));
        }
        for(int i = 0;i<worker.length;i++){
            sum+=map.get(map.floorKey(worker[i]));
        }
        return sum;
        
    }

}
