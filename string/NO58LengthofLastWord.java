package pers.jiahao.leetcode.string;

public class NO58LengthofLastWord {
	public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        String[] array = s.split(" ");
        int index = array.length-1;
        if(index<0){
            return 0;
        }
        while(array[index].equals(" ")){
            index--;
            if(index<0){
                return 0;
            }
        }
        return array[index].length();
        
    }

}
