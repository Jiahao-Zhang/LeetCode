package pers.jiahao.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NO609FindDuplicateFileinSystem {
	 public List<List<String>> findDuplicate(String[] paths) {
	        List<List<String>> container = new ArrayList<>();
	        if(paths==null||paths.length==0){
	            return container;
	        }
	        Map<String,List<String>> map = new HashMap<>();
	        for(int i = 0;i<paths.length;i++){
	            String[] temp = paths[i].split(" ");
	            for(int j = 1;j<temp.length;j++){
	                int contentStart = temp[j].indexOf("(")+1;
	                int contentEnd = temp[j].indexOf(")");
	                String content = temp[j].substring(contentStart,contentEnd);
	                if(map.containsKey(content)){
	                    map.get(content).add(temp[0]+"/"+temp[j].substring(0,contentStart-1));
	                }else{
	                    List<String> list = new ArrayList<>();
	                    list.add(temp[0]+"/"+temp[j].substring(0,contentStart-1));
	                    map.put(content,list);
	                }
	            }
	        }
	        Iterator<Map.Entry<String,List<String>>> it = map.entrySet().iterator();
	        while(it.hasNext()){
	            Map.Entry<String,List<String>> entry = it.next();
	            if(entry.getValue().size()>1)
	                container.add(entry.getValue());
	        }
	        return container;
	        
	    }

}
