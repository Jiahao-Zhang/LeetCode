package pers.jiahao.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;

public class NO884UncommonWordsfromTwoSentences {
	public String[] uncommonFromSentences(String A, String B) {
        String[] result = null;
        ArrayList<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        String[] arrayA = A.split(" ");
        String[] arrayB = B.split(" ");
        for(int i = 0;i<arrayA.length;i++){
            map.put(arrayA[i],map.getOrDefault(arrayA[i],0)+1);
        }
        for(int i = 0;i<arrayB.length;i++){
            map.put(arrayB[i],map.getOrDefault(arrayB[i],0)+1);
        }
        for(String key:map.keySet()){
            if(map.get(key)==1){
                list.add(key);
            }
        }
        result = new String[list.size()];
        list.toArray(result);
        return result;
        
    }

}
