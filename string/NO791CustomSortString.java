package pers.jiahao.leetcode.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NO791CustomSortString {
	 public String customSortString(String S, String T) {
	        HashMap<Character,Integer> map = new HashMap<>();
	        for(int i = 0;i<T.length();i++){
	            map.put(T.charAt(i),map.getOrDefault(T.charAt(i),0)+1);
	        }
	        StringBuffer buffer = new StringBuffer();
	        for(int i = 0;i<S.length();i++){
	            if(map.containsKey(S.charAt(i))){
	                int number = map.get(S.charAt(i));
	                while(number!=0){
	                    buffer.append(S.charAt(i));
	                    number--;
	                }
	                map.put(S.charAt(i),0);
	            }
	        }
	        Iterator<Map.Entry<Character,Integer>> it = map.entrySet().iterator();
	        while(it.hasNext()){
	            Map.Entry<Character,Integer> entry = it.next();
	            if(entry.getValue()!=0){
	                int number = entry.getValue();
	                while(number!=0){
	                    buffer.append(entry.getKey());
	                    number--;
	                }
	            }
	        }
	        return buffer.toString();
	        
	        
	    }

}
