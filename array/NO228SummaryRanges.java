package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class NO228SummaryRanges {
public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<>();
        if(nums==null||nums.length==0){
            return list;
        }
        if(nums.length==1){
            list.add(nums[0]+"");
            return list;
        }
        int left = 0;
        int right = 1;
        while(right<nums.length){
            if(nums[right]-nums[right-1]==1){
                right++;
            }else{
                if(right-1==left){
                    list.add(nums[left]+"");
                }else{
                    list.add(nums[left]+"->"+nums[right-1]);
                }
                left = right;
                right++;
            }
            if(right==nums.length){
                 if(right-1==left){
                    list.add(nums[left]+"");
                }else{
                    list.add(nums[left]+"->"+nums[right-1]);
                }
            }
        }
        return list;
    }

}
