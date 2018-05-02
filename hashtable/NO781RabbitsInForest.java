package pers.jiahao.leetcode.hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NO781RabbitsInForest {
	 public int numRabbits(int[] answers) {
	        if(answers==null||answers.length==0){
	            return 0;
	        }
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i = 0;i<answers.length;i++){
	            if(map.containsKey(answers[i])){
	                map.put(answers[i],map.get(answers[i])+1);
	            }else{
	                map.put(answers[i],1);
	            }
	        }
	        int result = 0;
	        Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
	        while(it.hasNext()){
	            Map.Entry<Integer,Integer> entry = it.next();
	           if(entry.getKey()==0){
	               result+=entry.getValue();
	           }else{
	               if(entry.getValue()<=entry.getKey()+1)
	                    result = result+entry.getKey()+1;
	               else{
	                   int multi = entry.getValue()/(entry.getKey()+1);
	                   int factor = entry.getValue()%(entry.getKey()+1);
	                   if(factor==0){
	                       result = result+(entry.getKey()+1)*multi;
	                   }else{
	                       result = result+(entry.getKey()+1)*(multi+1);
	                   }
	                        
	               }
	           }
	            
	        }
	        return result;
	    }

}
