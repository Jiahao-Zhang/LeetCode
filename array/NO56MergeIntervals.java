package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class NO56MergeIntervals {
	 public List<Interval> merge(List<Interval> intervals) {
	        List<Interval> list = new ArrayList<>();
	        List<Interval> temp = new ArrayList<>();
	        if(intervals == null||intervals.size()==0){
	            return list;
	        }
	        for(int i = 0;i<intervals.size();i++){
	            int size = list.size();
	            for(int j = 0;j<size;j++){
	                if(!(intervals.get(i).start>list.get(j).end||intervals.get(i).end<list.get(j).start)){
	                    intervals.get(i).start = Math.min(intervals.get(i).start,list.get(j).start);
	                    intervals.get(i).end = Math.max(intervals.get(i).end,list.get(j).end);
	                    temp.add(list.get(j));
	                }
	            }
	            
	            
	            list.removeAll(temp);
	            temp = new ArrayList<>();
	            list.add(intervals.get(i));
	        }
	        return list;
	        
	    }
	class Interval {
		      int start;
		      int end;
		      Interval() { start = 0; end = 0; }
		      Interval(int s, int e) { start = s; end = e; }
		 }

}
