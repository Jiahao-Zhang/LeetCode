package pers.jiahao.leetcode.math;

public class NO9PalindromeNumber {
	public boolean isPalindrome(int x) {
        if(x<0){
	            return false;
	        }else{
	            String str = String.valueOf(x);
	            char []charArray = str.toCharArray();
	            int i;
	            for(i = 0;i<charArray.length/2;i++){
	            	if(charArray[i] != charArray[charArray.length-1-i]){
	            		break;
	            	}
	            }
	            if(i==charArray.length/2){
	            	return true;
	            }else{
	            	return false;
	            } 
	    }
       
   }

}
