package pers.jiahao.leetcode.string;

public class NO345ReverseVowelsofaString {
	 public String reverseVowels(String s) {
	        int start = 0;
	        int end = s.length()-1;
	        char[] array = s.toCharArray();
	        while(start<end){
	            while(start<array.length&&!isVowel(array[start])){
	                start++;
	            }
	            while(end>=0&&!isVowel(array[end])){
	                end--;
	            }
	            if(start<end){
	                char temp = array[start];
	                array[start] = array[end];
	                array[end] = temp;
	            }
	            start++;
	            end--;
	        }
	        return String.valueOf(array);
	        
	    }
	    private boolean isVowel(char c){
	        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
	          ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
	    }

}
