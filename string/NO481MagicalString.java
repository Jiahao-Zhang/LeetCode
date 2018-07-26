package pers.jiahao.leetcode.string;

public class NO481MagicalString {
	 public int magicalString(int n) {
	        if(n<=0){
	            return 0;
	        }
	        if(n<=3){
	            return 1;
	        }
	        int[] array = new int[n];
	        array[0] = 1;
	        array[1] = 2;
	        array[2] = 2;
	        int head = 2, tail = 3, num = 1, result = 1;
	        while(tail<n){
	            for(int i = 0;i<array[head]&&tail<n;i++){
	                array[tail] = num;
	                if(num==1){
	                    result++;
	                }
	                tail++;
	            }
	            num = num^3;
	            head++;
	        }
	        return result;
	    }

}
