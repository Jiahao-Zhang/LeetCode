package pers.jiahao.leetcode.hashtable;

import java.util.HashMap;
import java.util.List;

public class NO648ReplaceWords {
	 public String replaceWords(List<String> dict, String sentence) {
	        StringBuilder result = new StringBuilder();
	        HashMap<String,Integer> map = new HashMap<>();
	        for(int i = 0;i<dict.size();i++){
	            map.put(dict.get(i),i);
	        }
	        String[] array = sentence.split(" ");
	        for(int i = 0 ;i<array.length;i++){
	            int j = 1;
	            for(j = 1;j<=array[i].length();j++){
	                String str = array[i].substring(0,j);
	                if(map.containsKey(str)){
	                    result.append(str);
	                    break;
	                }
	            }
	            if(j>array[i].length()){
	                result.append(array[i]);
	            }
	            if(i!=array.length-1)
	                result.append(" ");
	        }
	        return result.toString();
	    }

}
