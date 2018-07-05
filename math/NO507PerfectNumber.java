package pers.jiahao.leetcode.math;

import java.util.HashSet;

public class NO507PerfectNumber {
	public boolean checkPerfectNumber(int num) {
        if(num==1){
            return false;
        }
        int sum = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 2;i<=(int)Math.sqrt(num)+1;i++){
            if(num%i==0&&!set.contains(i)){
                sum+=i;
                set.add(i);
                int temp = num/i;
                if(!set.contains(temp)){
                    set.add(temp);
                    sum+=temp;
                }
            }
        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
        
        
    }

}
