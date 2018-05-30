package pers.jiahao.leetcode.string;

public class NO831MaskingPersonalInformation {
	 public String maskPII(String S) {
	        if(S.indexOf("@")==-1){
	            StringBuffer buffer = new StringBuffer();
	            for(int i = 0;i<S.length();i++){
	                if(S.charAt(i)>='0'&&S.charAt(i)<='9'){
	                    buffer.append(S.charAt(i));
	                }
	            }
	            String temp = buffer.toString();
	            String lastFourDigits = temp.substring(temp.length()-4,temp.length());
	            switch(temp.length()){
	                case 10:return "***-***-"+lastFourDigits;
	                case 11:return "+*-***-***-"+lastFourDigits;
	                case 12:return "+**-***-***-"+lastFourDigits;
	                case 13:return "+***-***-***-"+lastFourDigits;
	            }
	            return null;
	        }else{
	            S = S.toLowerCase();
	            String[] array = S.split("@");
	            String name = array[0].charAt(0)+"*****"+array[0].charAt(array[0].length()-1);
	            return name+"@"+array[1];
	        }
	    }

}
