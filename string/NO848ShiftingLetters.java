package pers.jiahao.leetcode.string;

public class NO848ShiftingLetters {
	public String shiftingLetters(String S, int[] shifts) {
        long sum = 0l;
        for(int i = 0;i<shifts.length;i++){
            sum+=shifts[i];
        }
        char[] array = S.toCharArray();
        for(int i = 0;i<S.length();i++){
            int temp = (int)(sum%26);
            if(array[i]+temp>'z'){
                temp = array[i]+temp-'z';
                array[i] = (char)('a'+temp-1);
            }else{
                array[i] = (char)(array[i]+temp);
            }
            
            sum = sum-shifts[i];
        }
        return new String(array);
        
    }

}
