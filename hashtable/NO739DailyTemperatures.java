package pers.jiahao.leetcode.hashtable;

public class NO739DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures==null||temperatures.length==0){
            return temperatures;
        }
        int[] result = new int[temperatures.length];
        int left = 0;
        int right = 0;
        for(left = 0;left<temperatures.length;left++){
            right = left;
            if(left==temperatures.length-1){
                result[left] = 0;
                break;
            }
            while(right<temperatures.length&&temperatures[right]<=temperatures[left]){
                right++;
            }
            if(right==temperatures.length){
                result[left] = 0;
            }else{
                result[left] = right-left;
            }
        }
        return result;
    }

}
