package pers.jiahao.leetcode.tp;

public class NO125ValidPalindrome {
	public boolean isPalindrome(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();
        while(left<=right){
            while(left<s.length()&&(s.charAt(left)<'a'||s.charAt(left)>'z')&&(s.charAt(left)<'0'||s.charAt(left)>'9')){
                left++;
            }
            while(right>=0&&(s.charAt(right)<'a'||s.charAt(right)>'z')&&(s.charAt(right)<'0'||s.charAt(right)>'9')){
                right--;
            }
            if(left>s.length()||right<0){
                break;
            }
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
        
    }

}
