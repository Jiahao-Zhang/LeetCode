package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class NO118PascalsTriangle {
	 public List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> container = new ArrayList<>();
	        List<Integer> list;
	        for(int i = 1;i<=numRows;i++){
	            list = new ArrayList<>();
	            for(int j = 1;j<=i;j++){
	                if(j==1||j==i){
	                    list.add(1);
	                }else{
	                    list.add(container.get(i-2).get(j-2)+container.get(i-2).get(j-1));
	                }
	            }
	            container.add(list);
	        }
	        return container;
	        
	    }

}
