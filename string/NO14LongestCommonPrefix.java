package pers.jiahao.leetcode.string;

public class NO14LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
         String prefix = "";
	        if(strs.length==0){
	        	return prefix;
	        }
	        String shortestStr = strs[0];
	        for(int i = 1;i<strs.length;i++){
	        	if(strs[i].length()<shortestStr.length()){
	        		shortestStr = strs[i];
	        	}
	        }
	        for(int i = shortestStr.length()-1;i>=0;i--){
	        	int j = 0;
	        	for(j = 0;j<strs.length;j++){
	        		if(!strs[j].substring(0, i+1).equals(shortestStr.substring(0, i+1))){
	        			break;
	        		}
	        	}
	        	if(j==strs.length){
	        		prefix = shortestStr.substring(0, i+1);
	        		break;
	        	}
	        }
	        return prefix;
  }

}
