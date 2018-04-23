package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class NO792NumberofMatchingSubsequences {
	public int numMatchingSubseq(String S, String[] words) {
        List<Integer[]>[] waiting = new List[128];
        int count = 0;
        for(char i = 0;i<='z';i++){
            waiting[i] = new ArrayList();
        }
        for(int i = 0;i<words.length;i++){
            waiting[words[i].charAt(0)].add(new Integer[]{i,1});
        }
        for(char c: S.toCharArray()){
            List<Integer[]> advance = new ArrayList(waiting[c]);
            waiting[c].clear();
            for(int i = 0;i<advance.size();i++){
                if(advance.get(i)[1]>=words[advance.get(i)[0]].length()){
                    count++;
                }else{
                    waiting[words[advance.get(i)[0]].charAt(advance.get(i)[1]++)].add(advance.get(i));
                }
            }
        }
        return count;
    }

}
