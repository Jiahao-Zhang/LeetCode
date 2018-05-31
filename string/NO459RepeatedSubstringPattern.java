package pers.jiahao.leetcode.string;

public class NO459RepeatedSubstringPattern {
	 public boolean repeatedSubstringPattern(String s) {
	        int length = s.length();
	        for(int i = length/2;i>=1;i--){
	            if(length%i==0){
	                String temp = s.substring(0,i);
	                while(temp.length()<length){
	                    temp = temp+temp;
	                }
	                temp = temp.substring(0,length);
	                if(temp.equals(s)){
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

}
