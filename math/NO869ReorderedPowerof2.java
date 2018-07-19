package pers.jiahao.leetcode.math;

import java.util.HashMap;

public class NO869ReorderedPowerof2 {
	public boolean reorderedPowerOf2(int N) {
        String str = String.valueOf(N);
        int power = 1;
        String temp = String.valueOf(power);
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        while(str.length()>temp.length()){
            power*=2;
            temp = String.valueOf(power);
        }
        while(temp.length()==str.length()){
            HashMap<Character,Integer> strMap = new HashMap(map);
            int i = 0;
            for(;i<temp.length();i++){
                if(strMap.containsKey(temp.charAt(i))&&strMap.get(temp.charAt(i))!=0){
                    strMap.put(temp.charAt(i),strMap.get(temp.charAt(i))-1);
                    continue;
                }else{
                    break;
                }
            }
            if(i==temp.length()){
                return true;
            }
            power*=2;
            temp = String.valueOf(power);
            
        }
        return false;
        
    }

}
