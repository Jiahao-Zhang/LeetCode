package pers.jiahao.leetcode.string;

public class NO680ValidPalindromeII {
	public boolean validPalindrome(String S) {
        if(S==null||S.length()==0){
            return true;
        }
        int left = 0;
        int right = S.length()-1;
        boolean flag = true;
        while(left<=right){
            if(S.charAt(left)==S.charAt(right)){
                left++;
                right--;
            }else{
                if(flag&&left+1<=right&&S.charAt(left+1)==S.charAt(right)){
                    left+=2;
                    right--;
                    flag = false;
                }else if(flag&&right-1>=left&&S.charAt(left)==S.charAt(right-1)){
                    right-=2;
                    left++;
                    flag = false;
                }else{
                   break;
                }
            }
        }
        if(left>right){
            return true;
        }else{
            left = 0;
            right = S.length()-1;
            flag = true;
            while(left<=right){
                if(S.charAt(left)==S.charAt(right)){
                    left++;
                    right--;
                }else{
                    if(flag&&right-1>=left&&S.charAt(left)==S.charAt(right-1)){
                        right-=2;
                        left++;
                        flag = false;
                    }else{
                        return false;
                    }
                }
            }   
        }
        return true;
    }

}
