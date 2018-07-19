package pers.jiahao.leetcode.string;

public class NO522LongestUncommonSubsequenceII {
	public int findLUSlength(String[] strs) {
        int length = -1;
        for(int i = 0;i<strs.length;i++){
            int j = 0;
            for(;j<strs.length;j++){
                if(i==j){
                    continue;
                }
                if(isSubsequence(strs[j],strs[i])){
                    break;
                }
            }
            if(j==strs.length){
                length = Math.max(length,strs[i].length());
            }
        }
        return length;
        
    }
    private boolean isSubsequence(String s1, String s2){
        int i2 = 0;
        for(int i1 = 0;i1<s1.length()&&i2<s2.length();i1++){
            if(s1.charAt(i1)==s2.charAt(i2)){
                i2++;
            }
        }
        return i2==s2.length();
    }

}
