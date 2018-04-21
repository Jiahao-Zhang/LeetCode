package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class NO119PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> container = new ArrayList<>();
        for(int i = 0;i<=rowIndex;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j<i+1;j++){
                if(j==0||j==i){
                    list.add(1);
                }else{
                    list.add(container.get(i-1).get(j)+container.get(i-1).get(j-1));
                }
            }
            container.add(list);
        }
        return container.get(rowIndex);
        
    }

}
