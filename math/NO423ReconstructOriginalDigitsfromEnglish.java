package pers.jiahao.leetcode.math;

public class NO423ReconstructOriginalDigitsfromEnglish {
	 public String originalDigits(String s) {
	        int[] count = new int[10];
	        StringBuffer buffer = new StringBuffer();
	        //zero one two three four five six seven eight nine
	        for(int i=0;i<s.length();i++){
	            switch (s.charAt(i)){
	                case 'z':count[0]++;break;
	                case 'w':count[2]++;break;
	                case 'u':count[4]++;break;
	                case 'x':count[6]++;break;
	                case 'g':count[8]++;break;
	                case 'o':count[1]++;break;//1-0-2-4
	                case 't':count[3]++;break;//3-2-8
	                case 'f':count[5]++;break;//5-4
	                case 's':count[7]++;break;//7-6
	                case 'i':count[9]++;break;//9-5-6-8
	            }
	        }
	        count[1] = count[1]-count[0]-count[2]-count[4];
	        count[3] = count[3]-count[2]-count[8];
	        count[5] = count[5]-count[4];
	        count[7] = count[7]-count[6];
	        count[9] = count[9]-count[5]-count[6]-count[8];
	        for(int i = 0;i<count.length;i++){
	            for(int j = 0;j<count[i];j++){
	                buffer.append(i+"");
	            }
	        }
	        return buffer.toString();
	    }

}
