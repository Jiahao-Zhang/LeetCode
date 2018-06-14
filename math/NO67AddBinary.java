package pers.jiahao.leetcode.math;

import java.util.LinkedList;


public class NO67AddBinary {
	public String addBinary(String a, String b) {
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
        if(array1.length<array2.length){
            return add(array1,array2);
        }else{
            return add(array2,array1);
        }
        
    }
    private String add(char[] array1,char[] array2){
        LinkedList<Character> list = new LinkedList<>();
        boolean isAddOne = false;
        int index = array2.length-1;
        for(int i = array1.length-1;i>=0;i--){
            int a = array1[i]-'0';
            int b = array2[index]-'0';
            if(!isAddOne){
               if(a+b==2){
                   isAddOne = true;
                   list.addFirst('0');
               }else if(a+b==1){
                   isAddOne = false;
                   list.addFirst('1');
               }else{
                   isAddOne = false;
                   list.addFirst('0');
               }
            }else{
                if(a+b+1==3){
                    isAddOne = true;
                    list.addFirst('1');
                }else if(a+b+1==1){
                    isAddOne = false;
                    list.addFirst('1');
                }else if(a+b+1==2){
                    isAddOne = true;
                    list.addFirst('0');
                }else{
                    isAddOne = false;
                    list.addFirst('0');
                }
            }
            index--;
        }
        for(int i = index;i>=0;i--){
            int a = array2[i]-'0';
            if(!isAddOne){
                list.addFirst(array2[i]);
                isAddOne = false;
            }else{
                if(a+1==2){
                    isAddOne = true;
                    list.addFirst('0');
                }else{
                    isAddOne = false;
                    list.addFirst('1');
                }
            }
        }
        if(isAddOne){
            list.addFirst('1');
        }
        StringBuffer buffer = new StringBuffer();
        for(int i = 0;i<list.size();i++){
            buffer.append(list.get(i));
        }
        return buffer.toString();
    }

}
