package pers.jiahao.leetcode.array;

public class NO565ArrayNesting {
	public int arrayNesting(int[] nums) {
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=0){
                int temp = nums[i];   
                nums[i] = -1;
                int max = 1;
                while(temp!=i){
                    int tmp = temp;
                    temp = nums[temp]; 
                    nums[tmp] = -1;   
                    max++;
                }   
                if(max>result){
                    result = max;
                    if(result == nums.length){
                        break;
                    }
                }
            }else{
                continue;
            }
           
        }
        return result;
    }
}
