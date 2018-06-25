package pers.jiahao.leetcode.tp;

import java.util.Arrays;

public class NO567PermutationinString {
	public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        for(int i = 0;i<s1.length();i++){
            count[s1.charAt(i)-'a']=1;
        }
        int length = s1.length();
        char[] array = s1.toCharArray();
        String temp = "";
        char[] array2 = null;
        Arrays.sort(array);
        s1 = new String(array);
        for(int i = 0;i<s2.length();i++){
            if(count[s2.charAt(i)-'a']==1){
                temp = "";
                if(i+length<=s2.length())
                    temp = s2.substring(i,i+length);
                else
                    break;
                array2 = temp.toCharArray();
                Arrays.sort(array2);
                temp = new String(array2);
                if(s1.equals(temp)){
                    return true;
                }
                
            }
        }
        return false;
        
    }

}
