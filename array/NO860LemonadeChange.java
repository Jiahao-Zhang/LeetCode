package pers.jiahao.leetcode.array;

import java.util.HashMap;

public class NO860LemonadeChange {
	public boolean lemonadeChange(int[] bills) {
        if(bills.length==0){
            return true;
        }
        if(bills[0]>5){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<bills.length;i++){
            if(bills[i]==5){
                map.put(5,map.getOrDefault(5,0)+1);
            }
            if(bills[i]==10){
                if(map.containsKey(5)){
                    if(map.get(5)<=0){
                        return false;
                    }else{
                        map.put(5,map.get(5)-1);
                        map.put(10,map.getOrDefault(10,0)+1);
                    }
                }else{
                    return false;
                }
            }
            if(bills[i]==20){
                if(map.containsKey(5)){
                    if(map.containsKey(10)&&map.get(10)>=1){
                        map.put(10,map.get(10)-1);
                        if(map.get(5)<=0){
                            return false;
                        }else{
                            map.put(5,map.get(5)-1);
                        }
                    }else{
                        if(map.get(5)>=3){
                            map.put(5,map.get(5)-3);
                        }else{
                            return false;
                        }
                    }
                }else{
                    return false;
                }
            }
        }
        return true;
        
    }

}
