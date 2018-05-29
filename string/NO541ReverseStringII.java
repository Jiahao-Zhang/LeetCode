package pers.jiahao.leetcode.string;

public class NO541ReverseStringII {
	 public String reverseStr(String s, int k) {
	        if(s==null||s.length()==0){
	            return new String();
	        }
	        if(s.length()<=k){
	            StringBuffer buffer = new StringBuffer(s);
	            String str = buffer.reverse().toString();
	            return str;
	        }else if(s.length()<=2*k){
	            String temp = s.substring(0,k);
	            StringBuffer buffer = new StringBuffer(temp);
	            String str = buffer.reverse().toString();
	            return str+s.substring(k,s.length());
	        }else{
	            String str = new String();
	            StringBuffer buffer = null;
	            for(int i = 0;i<s.length();i++){
	                if(i%(2*k)==0){
	                    String temp = null;
	                    if(i+k<=s.length())
	                        temp = s.substring(i,i+k);
	                    else{
	                        temp = s.substring(i,s.length());
	                    }
	                    buffer = new StringBuffer(temp);
	                    temp = buffer.reverse().toString();
	                    str = str+temp;
	                    i = i+k-1;
	                }else{
	                    str = str+s.charAt(i);
	                }
	                
	            }
	            return str;
	        }
	        
	    }

}
