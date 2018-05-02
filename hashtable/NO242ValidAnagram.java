package pers.jiahao.leetcode.hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class NO242ValidAnagram {
	 public boolean isAnagram(String s, String t) {
	        if(s==null||t==null){
	            return false;
	        }
	        Map<Character,Integer> map = new HashMap<>();
	        for(int i = 0;i<s.length();i++){
	            if(map.containsKey(s.charAt(i))){
	                map.put(s.charAt(i),map.get(s.charAt(i))+1);
	            }else{
	                map.put(s.charAt(i),1);
	            }
	        }
	        for(int j = 0;j<t.length();j++){
	            if(!map.containsKey(t.charAt(j))){
	                return false;
	            }else{
	                if(map.get(t.charAt(j))==0){
	                    return false;
	                }else{
	                    map.put(t.charAt(j),map.get(t.charAt(j))-1);
	                }
	            }
	        }
	        Iterator<Map.Entry<Character,Integer>> it = map.entrySet().iterator();
	        while(it.hasNext()){
	            Map.Entry<Character,Integer> entry = it.next();
	            if(entry.getValue()!=0){
	                return false;
	            }
	        }
	        return true;
	    }

}
