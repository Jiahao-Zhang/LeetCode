package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class NO729MyCalendarI {
	 public List<MyDate> list = new ArrayList<>();
	    public NO729MyCalendarI() {
	        
	    }
	    public boolean book(int start, int end) {
	       for(int i = 0;i<list.size();i++){
	            if(end<=list.get(i).start||start>=list.get(i).end){
	                continue;
	            }else{
	                return false;
	            }   
	       }
	       MyDate myDate = new MyDate(start,end);
	       list.add(myDate);
	       return true;
	    }
	}
	class MyDate{
	    public int start;
	    public int end;
	    public MyDate(int start,int end){
	        this.start = start;
	        this.end = end;
	    }

}
