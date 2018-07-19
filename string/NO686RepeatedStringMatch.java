package pers.jiahao.leetcode.string;

public class NO686RepeatedStringMatch {
	public int repeatedStringMatch(String A, String B) {
        String s = A;
        int count = 1;
        while(s.length()<=B.length()){
            if(s.indexOf(B)!=-1){
                return count;
            }
            s+=A;
            count++;
        }
        if(s.indexOf(B)!=-1){
            return count;
        }else{
            count++;
            s+=A;
            if(s.indexOf(B)!=-1){
                return count;
            }else{
                return -1;
            }
        }
    }

}
