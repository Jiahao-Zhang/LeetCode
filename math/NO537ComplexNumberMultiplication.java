package pers.jiahao.leetcode.math;

public class NO537ComplexNumberMultiplication {
	 public String complexNumberMultiply(String a, String b) {
	        String[] array1 = a.split("\\+");
	        String[] array2 = b.split("\\+");
	        int x1 = Integer.parseInt(array1[0]);
	        int x2 = Integer.parseInt(array2[0]);
	        int y1 = Integer.parseInt(array1[1].substring(0,array1[1].length()-1));
	        int y2 = Integer.parseInt(array2[1].substring(0,array2[1].length()-1));
	        int x = x1*x2-y1*y2;
	        int y = x1*y2+x2*y1;
	        return x+"+"+y+"i";
	        
	    }

}
