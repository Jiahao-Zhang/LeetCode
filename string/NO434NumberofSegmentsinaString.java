package pers.jiahao.leetcode.string;

public class NO434NumberofSegmentsinaString {
	public int countSegments(String s) {
        if(s.length()==0){
            return 0;
        }
        String[] array = s.split(" ");
        int length = array.length;
        for(int i = 0;i<array.length;i++){
            if(array[i].length()==0){
                length--;
            }
        }
        return length;
    }

}
