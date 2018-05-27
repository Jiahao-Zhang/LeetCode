package pers.jiahao.leetcode.string;

public class NO696CountBinarySubstrings {
	 public int countBinarySubstrings(String s) {
	        int pre = 0;
	        int cur = 1;
	        int count = 0;
	        for(int i = 1;i<s.length();i++){
	            if(s.charAt(i)==s.charAt(i-1)){
	                cur++;
	            }else{
	                pre = cur;
	                cur = 1;
	            }
	            if(pre>=cur){
	                count++;
	            }
	            
	        }
	        return count;
	    }

}
