package pers.jiahao.leetcode.tp;

public class NO28ImplementstrStr {
	public int strStr(String haystack, String needle) {
        if(haystack==null){
            return -1;
        }
        if(haystack.length()==0&&needle.length()!=0){
            return -1;
        }
        int length = needle.length();
        if(length==0){
            return 0;
        }
        for(int i = 0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String temp = new String();
                if(i+length<=haystack.length()){
                    temp = haystack.substring(i,i+length);
                    if(temp.equals(needle)){
                        return i;
                    }
                }else{
                    break;
                }
            }
        }
        return -1;  
    }

}
