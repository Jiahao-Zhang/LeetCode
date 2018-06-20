package pers.jiahao.leetcode.dp;

import java.util.ArrayList;
import java.util.List;

public class NO638ShoppingOffers {
	public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return helper(price,special,needs,0);
    }
    private int helper(List<Integer> price,List<List<Integer>> special,List<Integer> needs,int pos){
        int min = directPurchase(price,needs);
        for(int i = pos;i<special.size();i++){
            List<Integer> offer = special.get(i);
            List<Integer> temp = new ArrayList<Integer>();
            for(int j = 0;j<needs.size();j++){
                if(offer.get(j)>needs.get(j)){
                    temp = null;
                    break;
                }
                temp.add(needs.get(j)-offer.get(j));
            }
            if(temp!=null){
                min = Math.min(min,offer.get(offer.size()-1)+helper(price,special,temp,i));
            }    
        }
        return min;
    }
    private int directPurchase(List<Integer> price,List<Integer> needs){
        int sum = 0;
        for(int i = 0;i<needs.size();i++){
            sum+=price.get(i)*needs.get(i);
        }
        return sum;
    }

}
