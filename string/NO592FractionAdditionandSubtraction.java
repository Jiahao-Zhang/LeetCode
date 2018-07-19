package pers.jiahao.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class NO592FractionAdditionandSubtraction {
	public String fractionAddition(String expression) {
        List<Character> list = new ArrayList<>();
        for(char c:expression.toCharArray()){
            if(c=='-'){
                list.add('@');
            }
            if(c=='+'){
                list.add('@');
            }else{
                list.add(c);
            }
            
        }
        StringBuffer buffer = new StringBuffer();
        for(int i = 0;i<list.size();i++){
            buffer.append(list.get(i));
        }
        String str = new String(buffer);
        String[] array = str.split("@");
        int index = 0;
        if(array[0].length()==0){
            index++;
        }
        String[] fraction = array[index].split("/");
        int numerator = Integer.parseInt(fraction[0]);
        int denominator = Integer.parseInt(fraction[1]);
        for(int i = index+1;i<array.length;i++){
            fraction = array[i].split("/");
            int num = Integer.parseInt(fraction[0]);
            int den = Integer.parseInt(fraction[1]);
            numerator = num*denominator+numerator*den;
            denominator = den*denominator;
        }
        if(numerator==0){
            denominator = 1;
        }
        int divisor = findMaxCommonDivisor(numerator,denominator);
        numerator = numerator/divisor;
        denominator = denominator/divisor;
        if(denominator<0){
            denominator = -denominator;
            numerator = -numerator;
        }
        return numerator+"/"+denominator;  
    }
    private int findMaxCommonDivisor(int x,int y){
        while(x!=0){
            int r = y%x;
            y = x;
            x = r;
        }
        return y;
    }

}
