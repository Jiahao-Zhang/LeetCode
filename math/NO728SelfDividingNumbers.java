package pers.jiahao.leetcode.math;

import java.util.ArrayList;
import java.util.List;

public class NO728SelfDividingNumbers {
	 public List<Integer> selfDividingNumbers(int left, int right) {
	        List<Integer> list = new ArrayList<>();
	        for(int i = left;i<=right;i++){
	            if(i%10==0){
	                continue;
	            }
	            int number = i;
	            while(number>0){
	                int divider = number%10;
	                if(divider==0||i%divider!=0){
	                    break;
	                }
	                number = number/10;
	            }
	            if(number==0){
	                list.add(i);
	            }
	        }
	        return list;
	    }

}
