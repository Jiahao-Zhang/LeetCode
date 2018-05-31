package pers.jiahao.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NO17LetterCombinationsofaPhoneNumber {
	 public List<String> letterCombinations(String digits) {
         List<String> list = new ArrayList<String>();
	    	if(digits==null||digits.length()==0){
	    		return list;
	    	}
	        HashMap<Character, String> map = new HashMap<Character, String>();
	        
	        map.put('2',"abc");
	        map.put('3',"def");
	        map.put('4',"ghi");
	        map.put('5',"jkl");
	        map.put('6',"mno");
	        map.put('7',"pqrs");
	        map.put('8',"tuv");
	        map.put('9',"wxyz");
	        char[] digitsArrary = digits.toCharArray();
	        combine(map, list, "", digitsArrary, 0);
	        return list;
	        
	    }
	    public void combine(HashMap<Character, String> map,List<String> list,String prefix,char[] digitsArrary,int start){
	    	if(start>=digitsArrary.length){
	    		list.add(prefix);
	    		return;
	    	}
	    	String str = map.get(digitsArrary[start]);
	    	for(int i = 0;i<str.length();i++){
	    		prefix+=str.charAt(i);
	    		combine(map, list, prefix, digitsArrary, start+1);
             prefix = prefix.substring(0,prefix.length()-1);
	    	}
	    }

}
