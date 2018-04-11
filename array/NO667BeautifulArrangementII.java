package pers.jiahao.leetcode.array;

public class NO667BeautifulArrangementII {
	 public int[] constructArray(int n, int k) {
	        int[] result = new int[n];
	        int index = 0;
	        int small = 1;
	        int large = n;
	        while(index<k){
	            result[index] = small;
	            index++;
	            small++;
	            if(index<k){
	                result[index] = large;
	                index++;
	                large--;
	            }
	        }
	        if(k%2==0){
	            for(int i = index;i<n;i++){
	                result[i] = large;
	                large--;
	            }
	        }else{
	            for(int i = index;i<n;i++){
	                result[i] = small;
	                small++;
	            }
	        }
	        return result;
	        
	    }
}
