package pers.jiahao.leetcode.string;

public class NO557ReverseWordsinaStringIII {
	 public String reverseWords(String s) {
	        if(s==null){
	            return null;
	        }
	        if(s.length()==0){
	            return new String();
	        }
	        String[] array = s.split(" ");
	        StringBuffer buffer = new StringBuffer();
	        for(int i = 0;i<array.length;i++){
	            StringBuffer temp = new StringBuffer(array[i]);
	            buffer.append(temp.reverse().toString()+" ");
	        }
	        return buffer.toString().substring(0,s.length());
	    }

}
