package pers.jiahao.leetcode.math;

public class NO12IntegertoRoman {
	 public String intToRoman(int num) {
	        String []unit = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	        String []tenth = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	        String []hundredth = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	        String []thousandth = {"","M","MM","MMM"};
	        int numUnit = num%10;
	        int numTenth = (num%100)/10;
	        int numHundred = (num%1000)/100;
	        int numThousand = (num%10000)/1000;
	        return thousandth[numThousand]+hundredth[numHundred]+tenth[numTenth]+unit[numUnit];
	        
	    }

}
