package pers.jiahao.leetcode.array;

public class NO769MaxChunksToMakeSorted {
	 int result = 0;
	    public int maxChunksToSorted(int[] arr) {
	        split(arr);
	        return result;
	    }
	    public void split(int[] arr){
	        if(arr.length == 0){
	            return;
	        }
	        int min = arr[0];
	        int max = arr[0];
	        int index = 0;
	        int index2 = 0;
	        for(int i =1;i<arr.length;i++){
	            if(arr[i]<min){
	                min = arr[i];
	                index = i;
	            }
	        }
	        for(int i = 0;i<=index;i++){
	            if(arr[i]>max){
	                max = arr[i];
	                index2 = i;
	            }
	        }
	        for(int i = index;i<arr.length;i++){
	            if(arr[i]<max){
	                index = i;
	                for(int j = index2;j<=index;j++){
	                    if(arr[j]>max){
	                        max = arr[j];
	                    }
	                }
	            }
	        }
	        result++;
	        int[] newArr = new int[arr.length-1-index];
	        for(int i = 0;i<newArr.length;i++){
	            newArr[i] = arr[index+1];
	            index++;
	        }
	        split(newArr);
	    }

}
