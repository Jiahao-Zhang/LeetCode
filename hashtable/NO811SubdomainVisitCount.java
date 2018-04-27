package pers.jiahao.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NO811SubdomainVisitCount {
	 public List<String> subdomainVisits(String[] cpdomains) {
	        List<String> list = new ArrayList<>();
	        if(cpdomains==null||cpdomains.length==0){
	            return list;
	        }
	        Map<String, Integer> map = new HashMap<>();
	        for(int i = 0;i<cpdomains.length;i++){
	            String[] temp = cpdomains[i].split(" ");
	            if(!map.containsKey(temp[1])){
	                map.put(temp[1],Integer.parseInt(temp[0]));
	            }else{
	                map.put(temp[1],map.get(temp[1])+Integer.parseInt(temp[0]));
	            }
	            String[] temp2 = temp[1].split("\\.");
	            if(temp2.length==2){
	                if(!map.containsKey(temp2[1])){
	                    map.put(temp2[1],Integer.parseInt(temp[0]));
	                }else{
	                    map.put(temp2[1],map.get(temp2[1])+Integer.parseInt(temp[0]));
	                }
	            }
	            if(temp2.length==3){
	                String str = temp2[1]+"."+temp2[2];
	                if(!map.containsKey(str)){
	                    map.put(str,Integer.parseInt(temp[0]));
	                }else{
	                    map.put(str,map.get(str)+Integer.parseInt(temp[0]));
	                }
	                if(!map.containsKey(temp2[2])){
	                    map.put(temp2[2],Integer.parseInt(temp[0]));
	                }else{
	                    map.put(temp2[2],map.get(temp2[2])+Integer.parseInt(temp[0]));
	                }
	                
	            }
	        }
	        Iterator<Map.Entry<String,Integer>> it=map.entrySet().iterator();
	        while(it.hasNext()){
	            Map.Entry<String, Integer> entry = it.next();
	            list.add(entry.getValue()+" "+entry.getKey());
	        }
	        return list;
	    }

}
