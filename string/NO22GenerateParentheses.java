package pers.jiahao.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class NO22GenerateParentheses {
	 public List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<String>();
	        combine(list, "", 0, 0, n);
	        return list;
	    }
	    public void combine(List<String> list, String str, int open, int close, int max){
	    	if(open+close==2*max){
	    		list.add(str);
	    		return;
	    	}
	    	if(open<max){
             
	    		combine(list, str+"(", open+1, close, max);;
	    	}
	    	if(close<open){
	    		combine(list, str+")", open, close+1, max);
	    	}
	    }

}
