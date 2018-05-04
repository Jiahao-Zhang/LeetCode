package pers.jiahao.leetcode.hashtable;

import java.util.HashSet;

public class NO409LongestPalindrome {
	 public int longestPalindrome(String s) {
	        if(s==null||s.length()==0){
	            return 0;
	        }
	        HashSet<Character> set = new HashSet<>();
	        int count = 0;
	        for(int i = 0;i<s.length();i++){
	            if(set.contains(s.charAt(i))){
	                count++;
	                set.remove(s.charAt(i));
	            }else{
	                set.add(s.charAt(i));
	            }
	        }
	        if(set.size()==0){
	            return count*2;
	        }else{
	            return count*2+1;
	        }
	    }

}
