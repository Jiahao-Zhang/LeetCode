package pers.jiahao.leetcode.string;

public class NO520DetectCapital {
	   public boolean detectCapitalUse(String word) {
	        if(word==null||word.length()==0){
	            return false;
	        }
	        boolean[] flags = new boolean[word.length()];
	        for(int i = 0;i<word.length();i++){
	            if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
	                flags[i] = true;
	            }
	        }
	        boolean isAllLow = true;
	        boolean isAllUp = true;
	        int i = 1;
	        for(i = 1;i<flags.length;i++){
	            if(flags[i]){
	                isAllLow = false;
	                break;
	            }
	        }
	        for(i = 1;i<flags.length;i++){
	            if(!flags[i]){
	                isAllUp = false;
	                break;
	            }
	        }
	        if(flags[0]&&isAllUp){
	            return true;
	        }else if(flags[0]&&isAllLow){
	            return true;
	        }else if(!flags[0]&&isAllLow){
	            return true;
	        }else{
	            return false;
	        }
	       
	    }

}
