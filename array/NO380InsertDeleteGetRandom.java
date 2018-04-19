package pers.jiahao.leetcode.array;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class NO380InsertDeleteGetRandom {
	Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    Random random = new Random();
    public NO380InsertDeleteGetRandom() {
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            list.add(val);
            map.put(val,list.size()-1);
            return true;
        }else{
            return false;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }else{
            int index = map.get(val);
            if(index!=list.size()-1){
                list.set(index,list.get(list.size()-1));
                map.remove(list.get(list.size()-1));
                map.put(list.get(index),index);
            }
            map.remove(val);
            list.remove(list.size()-1);
            return true;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int rand= random.nextInt(list.size());
        return list.get(rand);
    }

}
