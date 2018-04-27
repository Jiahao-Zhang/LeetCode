package pers.jiahao.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NO500KeyboardRow {
	public String[] findWords(String[] words) {
        if(words==null||words.length==0){
            return words;
        }
        char[] first = {'Q','W','E','R','T','Y','U','I','O','P'};
        char[] second = {'A','S','D','F','G','H','J','K','L'};
        char[] third = {'Z','X','C','V','B','N','M'};
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<first.length;i++){
            map.put(first[i],1);
        }
        for(int i = 0;i<second.length;i++){
            map.put(second[i],2);
        }
        for(int i = 0;i<third.length;i++){
            map.put(third[i],3);
        }
        List<String> list = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            String tp = words[i].toUpperCase();
            char[] temp = tp.toCharArray();
            int j = 0;
            for(j = 0;j<temp.length-1;j++){
                if(map.get(temp[j])!=map.get(temp[j+1])){
                    break;
                }
            }
            if(j==temp.length-1){
                list.add(words[i]);
            }
        }
        String[] result = new String[list.size()];
        for(int i = 0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
        
    }

}
