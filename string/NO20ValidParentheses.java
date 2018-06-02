package pers.jiahao.leetcode.string;

import java.util.Stack;

public class NO20ValidParentheses {
	public boolean isValid(String s) {
        boolean result = false;
		        Stack<Character> stack = new Stack<Character>();
		        for(int i = 0;i<s.length();i++){
	                if(stack.isEmpty()){
	                    stack.push(s.charAt(i));
	                }else{
	                    switch (s.charAt(i)) {
					case ')':
						if(stack.peek()=='('){
							stack.pop();
						}else{
							stack.push(s.charAt(i));
						}
						break;
					case '}':
						if(stack.peek()=='{'){
							stack.pop();
						}else{
							stack.push(s.charAt(i));
						}
						break;
					case ']':
						if(stack.peek()=='['){
							stack.pop();
						}else{
							stack.push(s.charAt(i));
						}
						break;
					default:
						stack.push(s.charAt(i));
						break;
					}
	                }
		        	
		        }
		        result = stack.isEmpty();
		        return result;
   }

}
