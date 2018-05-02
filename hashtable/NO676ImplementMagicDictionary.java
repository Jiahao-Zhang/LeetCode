package pers.jiahao.leetcode.hashtable;

import java.util.HashMap;

public class NO676ImplementMagicDictionary {
	class MagicDictionary {

	    /** Initialize your data structure here. */
	    HashMap<String, String> map;
	    public MagicDictionary() {
	        map = new HashMap<String,String>();
	    }
	    
	    /** Build a dictionary through a list of words */
	    public void buildDict(String[] dict) {
	        for(int i = 0;i<dict.length;i++){
	            map.put(dict[i],null);
	        }
	    }
	    
	    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
	    public boolean search(String word) {
	        char[] array = word.toCharArray();
	        for(int i = 0;i<array.length;i++){
	            char temp = array[i];
	            for(char j = 'a';j<='z';j++){
	                if(temp==j){
	                    continue;
	                }
	                array[i] = j;
	                String str = String.valueOf(array);
	                if(map.containsKey(str)){
	                    return true;
	                }
	            }
	            array[i] = temp;
	        }
	        return false;
	    }
	}
	

}
