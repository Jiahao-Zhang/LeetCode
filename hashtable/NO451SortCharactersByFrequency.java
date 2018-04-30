package pers.jiahao.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NO451SortCharactersByFrequency {
	public String frequencySort(String s) {
        if(s==null||s.length()==0){
            return new String();
        }
        Map<Character,Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i))+1;
                map.put(s.charAt(i),count);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        List<Character>[] buckets = new ArrayList[s.length()+1];
        Iterator<Map.Entry<Character,Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> entry = it.next();
            int index = entry.getValue();
            if(buckets[index]==null){
                buckets[index] = new ArrayList<>();
            }
            buckets[index].add(entry.getKey());
        }
        for(int i = s.length();i>=0;i--){
            if(buckets[i]!=null){
                for(int j = 0;j<buckets[i].size();j++){
                    int count = i;
                    for(int k = 0;k<count;k++){
                        result.append(buckets[i].get(j)+"");
                    }
                }
            }
        }
        return result.toString();
    }

}
