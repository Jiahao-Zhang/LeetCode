package pers.jiahao.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NO761SpecialBinaryString {
	 public String makeLargestSpecial(String S) {
	        int i = 0;
	        int count = 0;
	        List<String> result = new ArrayList<>();
	        for(int j = 0;j<S.length();j++){
	            if(S.charAt(j)=='1'){
	                count++;
	            }else{
	                count--;
	            }
	            if(count==0){
	                result.add('1'+makeLargestSpecial(S.substring(i+1,j))+'0');
	                i = j+1;
	            }
	        }
	        Collections.sort(result,Collections.reverseOrder());
	        return String.join("",result);
	        
	    }

}
