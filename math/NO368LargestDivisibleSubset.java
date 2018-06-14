package pers.jiahao.leetcode.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NO368LargestDivisibleSubset {
	public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums==null||nums.length==0){
            return result;
        }
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int[] count = new int[nums.length];
        int[] pre = new int[nums.length];
        int index = -1;
        for(int i = 0;i<nums.length;i++){
            count[i] = 1;
            pre[i] = -1;
            for(int j = i-1;j>=0;j--){
                if(nums[i]%nums[j]==0){
                    if(count[j]+1>count[i]){
                        count[i] = count[j]+1;
                        pre[i] = j;
                    }
                }
            }
            if(count[i]>max){
                max = count[i];
                index = i;
            }
        }
        while(index!=-1){
            result.add(nums[index]);
            index = pre[index];
        }
        return result;
        
    }

}
