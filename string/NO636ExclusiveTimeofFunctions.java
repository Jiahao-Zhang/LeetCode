package pers.jiahao.leetcode.string;

import java.util.List;
import java.util.Stack;

public class NO636ExclusiveTimeofFunctions {
	public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        int size = logs.size();
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;
        for(int i = 0;i<size;i++){
            String[] array = logs.get(i).split(":");
            if(!stack.empty()){
                result[stack.peek()]+=Integer.parseInt(array[2])-prevTime;
            }
            prevTime = Integer.parseInt(array[2]);
            if(array[1].equals("start")){
                stack.push(Integer.parseInt(array[0]));
            }else{
                prevTime++;
                result[stack.pop()]++;
            }
        }
        return result;
    }

}
