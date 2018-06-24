package pers.jiahao.leetcode.tp;

import java.util.List;

public class NO524LongestWordinDictionarythroughDeleting {
	public String findLongestWord(String s, List<String> d) {
        String result = new String();
        for(int i = 0;i<d.size();i++){
            if(isSubSequence(s,d.get(i))){
                if(result.length()==d.get(i).length()&&d.get(i).compareTo(result)<0){
                    result = d.get(i);
                }else if(result.length()<d.get(i).length()){
                    result = d.get(i);
                }
            }
        }
        return result;
        
    }
    private boolean isSubSequence(String s1,String s2){
        int i2 = 0;
        for(int i1=0;i1<s1.length()&&i2<s2.length();i1++){
            if(s1.charAt(i1)==s2.charAt(i2)){
                i2++;
            }
        }
        return i2==s2.length();
    }

}
