package pers.jiahao.leetcode.math;

public class NO171ExcelSheetColumnNumber {
	 public int titleToNumber(String s) {
	        char[] array = s.toCharArray();
	        int pow = 0;
	        int number = 0;
	        for(int i = array.length-1;i>=0;i--){
	            number+=(array[i]-'A'+1)*Math.pow(26,pow);
	            pow++;
	        }
	        return number;
	    }

}
