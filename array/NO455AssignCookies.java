package pers.jiahao.leetcode.array;

import java.util.Arrays;

public class NO455AssignCookies {
	 public int findContentChildren(int[] g, int[] s) {
	        if(g==null||s==null||g.length==0||s.length==0){
	            return 0;
	        }
	        Arrays.sort(g);
	        Arrays.sort(s);
	        int count = 0;
	        int j = 0;
	        for(int i = 0;i<s.length&&j<g.length;i++){
	            if(s[i]>=g[j]){
	                count++;
	                j++;
	            }
	        }
	        return count;
	    }

}
