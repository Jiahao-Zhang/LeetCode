package pers.jiahao.leetcode.array;

public class NO709ToLowerCase {
	public String toLowerCase(String str) {
        int num = 'A'-'a';
        StringBuffer buffer = new StringBuffer();
        for(char c:str.toCharArray()){
            if(c>='A'&&c<='Z'){
                c = (char)(c-num);
            }
            buffer.append(c);
        }
        return buffer.toString();
        
    }

}
