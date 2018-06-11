package pers.jiahao.leetcode.math;

import java.util.HashSet;

public class NO753CrackingtheSafe {
	public String crackSafe(int n, int k) {
        StringBuffer buffer = new StringBuffer();
        for(int i = 0;i<n;i++){
            buffer.append('0');
        }
        int total = (int)Math.pow(k,n);
        HashSet<String> set = new HashSet<>();
        set.add(buffer.toString());
        dfs(n,k,set,total,buffer);
        return buffer.toString();
    }
    private boolean  dfs(int n,int k, HashSet<String> set, int total,StringBuffer buffer){
        if(set.size()==total){
            return true;
        }
        String prev = buffer.substring(buffer.length()-n+1,buffer.length());
        for(int i = 0;i<k;i++){
            String temp = prev+i;
            if(!set.contains(temp)){
                set.add(temp);
                buffer.append(i);
                if(dfs(n,k,set,total,buffer)){
                    return true;
                }else{
                    set.remove(temp);
                    buffer.delete(buffer.length()-1,buffer.length());
                }
            }
        }
        return false;
    }

}
