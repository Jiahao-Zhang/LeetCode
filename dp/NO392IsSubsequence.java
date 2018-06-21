package pers.jiahao.leetcode.dp;

public class NO392IsSubsequence {
	public boolean isSubsequence(String s, String t) {
        int i2 = 0;
        for(int i1 = 0;i2<s.length()&&i1<t.length();i1++){
            if(s.charAt(i2)==t.charAt(i1)){
                i2++;
            }
        }
        return i2==s.length();
    }

}
