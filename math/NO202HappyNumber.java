package pers.jiahao.leetcode.math;

import java.util.HashSet;


public class NO202HappyNumber {
	public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return helper(n,set);
        
    }
    private boolean helper(int n, HashSet<Integer> set){
        if(set.contains(n)){
            return false;
        }
        set.add(n);
        int sum = 0,remain = 0;
        while(n>0){
            remain = n%10;
            sum+=remain*remain;
            n = n/10;
        }
        if(sum==1){
            return true;
        }else{
            return helper(sum,set);
        }
    }

}
