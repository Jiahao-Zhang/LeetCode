package pers.jiahao.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NO49GroupAnagrams {
	 public List<List<String>> groupAnagrams(String[] strs) {
	        List<List<String>> result = new ArrayList<>();
	        int[] prime = new int[26];
	        int number = 2;
	        for(int i = 0;i<26;i++){
	            while(!isPrime(number)){
	                number++;
	            }
	            prime[i] = number;
	            number++;
	        }
	        if(strs==null||strs.length==0){
	            return result;
	        }
	        HashMap<Integer,List<String>> map = new HashMap<>();
	        for(int i = 0;i<strs.length;i++){
	            String str = strs[i];
	            int key = 1;
	            for(int j = 0;j<str.length();j++){
	                key*=prime[str.charAt(j)-'a'];
	            }
	            if(map.containsKey(key)){
	                map.get(key).add(str);
	            }else{
	                List<String> list = new ArrayList<>();
	                list.add(str);
	                map.put(key,list);
	            }
	        }
	        for(List<String> list:map.values()){
	            result.add(list);
	        }
	        return result;
	        
	    }
	    private boolean isPrime(int number){
	        for(int i=2;i<=Math.sqrt(number);i++){
	            if(number%i==0){
	                return false;
	            }
	        }
	        return true;
	    }

}
