package pers.jiahao.leetcode.string;

public class NO788RotatedDigits {
	public int rotatedDigits(int N) {
        int count = 0;
       for(int i = 1;i<=N;i++){
           if(isValid(i)){
               count++;
           }
       }
        return count;
    }
    public boolean isValid(int N){
        boolean valid = false;
        while(N>0){
            int temp = N%10;
            switch (temp){
                case 2:valid = true;break;
                case 5:valid = true;break;
                case 6:valid = true;break;
                case 9:valid = true;break;
                case 3:return false;
                case 4:return false;
                case 7:return false;
                default:break;
            }
            N = N/10;
        }
        return valid;
    }

}
