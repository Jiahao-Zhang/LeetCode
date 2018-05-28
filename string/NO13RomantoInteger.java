package pers.jiahao.leetcode.string;

public class NO13RomantoInteger {
	 public int romanToInt(String s) {
	        char []roman = {'I','V','X','L','C','D','M'};
	        int []integers = {1,5,10,50,100,500,1000};
	        int sum = 0;
	        char []charArray = s.toCharArray();
	        int []toInt = new int[charArray.length];
	        for(int i = 0;i<charArray.length;i++){
	            for(int j = 0;j<7;j++){
	                if(charArray[i] == roman[j]){
	                    toInt[i] = j;
	                }
	            }
	        }
	        for(int i=0;i<charArray.length-1;i++){
	        	if(integers[toInt[i]]>=integers[toInt[i+1]]){
	        		sum+=integers[toInt[i]];
	        	}else{
	        		sum-=integers[toInt[i]];
	        	}
	        }
	        return sum+integers[toInt[charArray.length-1]];
	     }

}
