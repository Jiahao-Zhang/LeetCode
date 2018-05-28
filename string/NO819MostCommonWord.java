package pers.jiahao.leetcode.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NO819MostCommonWord {
	 public String mostCommonWord(String paragraph, String[] banned) {
	        paragraph = paragraph.toLowerCase();
	        String[] words = paragraph.split(" ");
	        HashSet<String> set = new HashSet<>();
	        for(int i = 0;i<banned.length;i++){
	            set.add(banned[i]);
	        }
	        HashMap<String,Integer> map = new HashMap<>();
	        for(int i = 0;i<words.length;i++){
	            if(words[i].charAt(0)=='\''){
	               words[i] = words[i].substring(1,words[i].length());
	            }
	            if(words[i].charAt(words[i].length()-1)=='\''||words[i].charAt(words[i].length()-1)=='!'||words[i].charAt(words[i].length()-1)==','||words[i].charAt(words[i].length()-1)=='.'||words[i].charAt(words[i].length()-1)=='?'||words[i].charAt(words[i].length()-1)==';'||words[i].charAt(words[i].length()-1)=='!'){
	                words[i] = words[i].substring(0,words[i].length()-1);
	            }
	            if(set.contains(words[i])){
	                continue;
	            }
	            map.put(words[i],map.getOrDefault(words[i],0)+1);
	        }
	        String result = new String();
	        int max = 0;
	        for(Map.Entry<String,Integer> entry:map.entrySet()){
	            if(entry.getValue()>max){
	                max = entry.getValue();
	                result = entry.getKey();
	            }
	        }
	        return result;
	        
	    }

}
