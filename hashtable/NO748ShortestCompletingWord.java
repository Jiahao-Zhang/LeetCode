package pers.jiahao.leetcode.hashtable;

public class NO748ShortestCompletingWord {
	 public String shortestCompletingWord(String licensePlate, String[] words) {
	        if(words==null||words.length==0){
	            return new String();
	        }
	        licensePlate = licensePlate.toLowerCase();
	        String minString = "1111111111111111";
	        for(int i = 0;i<words.length;i++){
	            boolean[] ifVisited = new boolean[words[i].length()];
	            int j = 0;
	            for(j = 0;j<licensePlate.length();j++){
	                if(licensePlate.charAt(j)>='a'&&licensePlate.charAt(j)<='z'){
	                    int k = 0;
	                    for(k = 0;k<words[i].length();k++){
	                        if(!ifVisited[k]&&words[i].charAt(k)==licensePlate.charAt(j)){
	                            ifVisited[k] = true;
	                            break;
	                        }
	                    }
	                    if(k==words[i].length()){
	                        break;
	                    }
	                }
	            }
	            if(j==licensePlate.length()){
	                if(words[i].length()<minString.length()){
	                    minString = words[i];
	                }
	            }
	        }
	        return minString;
	        
	    }

}
