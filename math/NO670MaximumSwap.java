package pers.jiahao.leetcode.math;

public class NO670MaximumSwap {
	 public int maximumSwap(int num) {
	        String str = String.valueOf(num);
	        char[] charArray = str.toCharArray();
	        for(int i = 0;i<charArray.length;i++){
	            char max = charArray[i];
	            int index = i;
	            for(int j = i+1;j<charArray.length;j++){
	                if(charArray[j]>max){
	                    max = charArray[j];
	                    index = j;
	                }else if(charArray[j]==max){
	                    if(index!=i){
	                        max = charArray[j];
	                        index = j;
	                    }
	                }
	            }
	            if(index!=i){
	                char temp = charArray[index];
	                charArray[index] = charArray[i];
	                charArray[i] = temp;
	                break;
	            }
	        }
	        String temp = String.valueOf(charArray);
	        return Integer.parseInt(temp);
	        
	    }

}
