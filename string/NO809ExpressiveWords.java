package pers.jiahao.leetcode.string;

public class NO809ExpressiveWords {
	 public int expressiveWords(String S, String[] words) {
	        int count = 0;
	        for(String w:words){
	            int i = 0;
	            int j = 0;
	            for(i = 0;i<S.length();i++){
	                if(j<w.length()&&S.charAt(i)==w.charAt(j)){
	                    j++;
	                }else if(i>0&&S.charAt(i)==S.charAt(i-1)&&i+1<S.length()&&S.charAt(i)==S.charAt(i+1)){
	                    i++;
	                }else if(!(i>1&&S.charAt(i)==S.charAt(i-1)&&S.charAt(i)==S.charAt(i-2))){
	                    break;
	                }
	            }
	            if(i==S.length()&&j==w.length()){
	                count++;
	            }
	        }
	        return count;
	        
	    }

}
