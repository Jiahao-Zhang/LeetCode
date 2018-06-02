package pers.jiahao.leetcode.string;

public class NO443StringCompression {
	public int compress(char[] chars) {
        int count = 1;
        StringBuffer buffer = new StringBuffer();
        for(int i = 0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
            }else{
                if(count!=1)
                    buffer.append(chars[i]+""+count);
                else
                    buffer.append(chars[i]+"");
                count = 1;
            }
        }
        if(count!=1){
            buffer.append(chars[chars.length-1]+""+count);
        }else{
            buffer.append(chars[chars.length-1]+"");
        }
        for(int i = 0;i<buffer.length();i++){
            chars[i] = buffer.charAt(i);
        }
        return buffer.length();
    }

}
