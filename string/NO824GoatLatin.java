package pers.jiahao.leetcode.string;

public class NO824GoatLatin {
	 public String toGoatLatin(String S) {
	        if(S==null||S.length()==0){
	            return null;
	        }
	        String[] array = S.split(" ");
	        StringBuffer strbuffer = new StringBuffer();
	        for(int i = 0;i<array.length;i++){
	            if(array[i].charAt(0)=='a'||array[i].charAt(0)=='e'||array[i].charAt(0)=='i'
	              ||array[i].charAt(0)=='o'||array[i].charAt(0)=='u'
	               ||array[i].charAt(0)=='A'||array[i].charAt(0)=='E'||array[i].charAt(0)=='I'
	               ||array[i].charAt(0)=='O'||array[i].charAt(0)=='U'){
	                array[i] = array[i]+"ma";
	            }else{
	                array[i] = array[i].substring(1,array[i].length())+array[i].charAt(0)+"ma";
	            }
	            for(int j=0;j<=i;j++){
	                array[i] = array[i]+'a';
	            }
	            if(i!=array.length-1)
	                strbuffer.append(array[i]+" ");
	            else
	                strbuffer.append(array[i]);
	            
	        }
	        return strbuffer.toString();
	        
	    }

}
