package pers.jiahao.leetcode.array;

import java.util.HashSet;

public class NO318MaximumProductofWordLengths {
	public int maxProduct(String[] words) {
        int result = 0;
        HashSet<Character>[] set = new HashSet[words.length];
        for(int i = 0;i<words.length;i++){
            set[i] = new HashSet<Character>();
            for(int j = 0;j<words[i].length();j++){
                set[i].add(words[i].charAt(j));
            }
        }
        for(int i = 0;i<words.length;i++){
            for(int j = i+1;j<words.length;j++){
                int k = 0;
                for(k = 0;k<words[j].length();k++){
                    if(set[i].contains(words[j].charAt(k))){
                        break;
                    }
                }
                if(k==words[j].length()){
                    result = Math.max(words[i].length()*words[j].length(),result);
                }
            }
        }
        return result;
        
    }

}
