package pers.jiahao.leetcode.string;

public class NO647PalindromicSubstrings {
	  int count = 0;
	    public int countSubstrings(String s) {
	        if(s==null||s.length()==0){
	            return 0;
	        }
	        for(int i = 0;i<s.length();i++){
	            count(s,i,i);
	            count(s,i,i+1);
	        }
	        return count;
	        
	    }
	    private void count(String s, int left, int right){
	        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
	            count++;
	            left--;
	            right++;
	        }
	    }

}
