package pers.jiahao.leetcode.tp;

public class NO845LongestMountaininArray {
	public int longestMountain(int[] A) {
        if(A==null||A.length==0){
            return 0;
        }
        int slow = 0;
        int fast = 1;
        int max = 0;
        boolean flag = false;
        boolean flag2 = false;
        while(slow<A.length){
            if(fast<A.length&&A[slow]==A[fast]){
                slow++;
                fast++;
                continue;
            }
            while(fast<A.length&&A[fast-1]<A[fast]){
                flag = true;
                fast++;
            }
            if(fast>=A.length){
                break;
            }else{
                if(flag){
                    while(fast<A.length&&A[fast-1]>A[fast]){
                        flag2 = true;
                        fast++;
                    }
                    if(flag2){
                        max = Math.max(max,fast-slow);
                        if(fast>=A.length){
                            break;
                        }
                        slow = fast-1;
                    }else{
                        slow = fast-1;
                    }
                    
                }else{
                    slow++;
                    fast++;
                }
               
            }
             flag = false;
            flag2 = false;
        }
        return max;
        
    }

}
