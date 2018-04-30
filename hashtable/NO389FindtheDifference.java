package pers.jiahao.leetcode.hashtable;

import java.util.HashMap;

public class NO389FindtheDifference {
	 public char findTheDifference(String s, String t) {
	        char result = '0';
	        HashMap<Character,Integer> map = new HashMap<>();
	        for(int i = 0;i<s.length();i++){
	            if(!map.containsKey(s.charAt(i))){
	                map.put(s.charAt(i),1);
	            }else{
	                map.put(s.charAt(i),map.get(s.charAt(i))+1);
	            }
	                
	        }
	        for(int i = 0;i<t.length();i++){
	            if(!map.containsKey(t.charAt(i))){
	                result = t.charAt(i);
	                break;
	            }else{
	                if(map.get(t.charAt(i))==0){
	                    result = t.charAt(i);
	                    break;
	                }else{
	                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
	                }
	            }
	        }
	        return result;
	    }

}
