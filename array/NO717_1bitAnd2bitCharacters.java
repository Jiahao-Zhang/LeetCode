package pers.jiahao.leetcode.array;
public class NO717_1bitAnd2bitCharacters {
	public boolean isOneBitCharacter(int[] bits) {
        boolean result = false;
        int index = 0;
        if(bits[bits.length-1]==1){
            return result;
        } 
        while(index<bits.length){
            if(index==bits.length-1&&bits[index]==0){
                result = true;
                break;
            }
            if(bits[index]==1){
                index+=2;
            }else{
                index+=1;
            }
        }
        return result;
        
    }

}
