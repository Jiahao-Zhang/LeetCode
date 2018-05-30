package pers.jiahao.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class NO816AmbiguousCoordinates {
	public List<String> ambiguousCoordinates(String S) {
        S = S.substring(1,S.length()-1);
        List<String> result = new ArrayList<>();
        for(int i = 1;i<=S.length()-1;i++){
            List<String> left = split(S.substring(0,i));
            List<String> right = split(S.substring(i,S.length()));
            for(int j = 0;j<left.size();j++){
                for(int k = 0;k<right.size();k++){
                    result.add('('+left.get(j)+", "+right.get(k)+')');
                }
            }
        }
        return result;
       
        
    }
    private List<String> split(String S){
        char[] array = S.toCharArray();
        int length = S.length();
        List<String> result = new ArrayList<>();
        if(array[0]=='0'&&array[length-1]=='0'){
            if(length==1)
                result.add("0");
            return result;
        }
        if(array[0]=='0'){
            String temp = "0."+S.substring(1,length);
            result.add(temp);
            return result;
        }
        if(array[length-1]=='0'){
            result.add(S);
            return result;
        }
        result.add(S);
        for(int i = 1;i<=length-1;i++){
            result.add(S.substring(0,i)+'.'+S.substring(i,length));
        }
        return result;
    }

}
