package pers.jiahao.leetcode.math;

import java.util.LinkedList;

public class NO415AddStrings {
	public String addStrings(String num1, String num2) {
        char[] array1 = num1.toCharArray();
        char[] array2 = num2.toCharArray();
        if(array1.length<array2.length){
            return add(array1,array2);
        }else{
            return add(array2,array1);
        }
        
    }
    private String add(char[] array1,char[] array2){
        int length1 = array1.length;
        int length2 = array2.length;
        LinkedList<Integer> list = new LinkedList<>();
        boolean isAddOne = false;
        int index = length2-1;
        for(int i = length1-1;i>=0;i--){
            int a = array1[i]-'0';
            int b = array2[index]-'0';
            int sum = a+b;
            if(isAddOne){
                sum++;
            }
            if(sum>=10){
                isAddOne = true;
                sum = sum%10;
            }else{
                isAddOne = false;
            }
            list.addFirst(sum);
            index--;
        }
        for(int i = index;i>=0;i--){
            int a = array2[i]-'0';
            int sum = a;
            if(isAddOne){
                sum++;
            }
            if(sum>=10){
                isAddOne = true;
                sum = sum%10;
            }else{
                isAddOne = false;
            }
            list.addFirst(sum);
        }
        if(isAddOne){
            list.addFirst(1);
        }
        StringBuffer buffer = new StringBuffer();
        for(int i = 0;i<list.size();i++){
            buffer.append(list.get(i)+"");
        }
        return buffer.toString();
    }

}
