package pers.jiahao.leetcode.tp;

public class NO344ReverseString {
	 public String reverseString(String s) {
	        if(s==null||s.length()==0){
	            return new String();
	        }
	        int left = 0;
	        int right = s.length()-1;
	        char[] array = s.toCharArray();
	        while(left<right){
	            char temp = array[left];
	            array[left] = array[right];
	            array[right] = temp;
	            left++;
	            right--;  
	        }
	        return new String(array);
	        
	    }

}
