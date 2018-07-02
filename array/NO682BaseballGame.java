package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class NO682BaseballGame {
	public int calPoints(String[] ops) {
        List<Integer> rounds = new ArrayList<>();
        int sum = 0;
        for(int i = 0;i<ops.length;i++){
            if(ops[i].equals("C")){
                sum = sum-rounds.get(rounds.size()-1);
                rounds.remove(rounds.size()-1);
            }else if(ops[i].equals("D")){
                sum+=rounds.get(rounds.size()-1)*2;
                rounds.add(rounds.get(rounds.size()-1)*2);
            }else if(ops[i].equals("+")){
                sum+=rounds.get(rounds.size()-1)+rounds.get(rounds.size()-2);
                rounds.add(rounds.get(rounds.size()-1)+rounds.get(rounds.size()-2));
            }else{
                sum+=Integer.parseInt(ops[i]);
                rounds.add(Integer.parseInt(ops[i]));
            }
        }
        return sum;
    }

}
