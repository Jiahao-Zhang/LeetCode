package pers.jiahao.leetcode.string;

import java.util.TreeMap;

public class NO833FindAndReplaceinString {
	public String findReplaceString(String S, int[] indexes, String[] s, String[] t) {
        if(indexes.length==0){
            return S;
        }
        TreeMap<Integer, String[]> map = new TreeMap<>();
        for(int i = 0;i<indexes.length;i++){
            map.put(indexes[i],new String[]{s[i],t[i]});
        }
        StringBuffer buffer = new StringBuffer();
        int start = 0;
        for(int key:map.keySet()){
            if(S.indexOf(map.get(key)[0],key)==key){
                buffer.append(S.substring(start,key)).append(map.get(key)[1]);
                start = key+map.get(key)[0].length();
            }
        }
        if(start!=S.length()){
            buffer.append(S.substring(start,S.length()));
        }
        return buffer.toString();
        
        
    }

}
