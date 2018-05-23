package pers.jiahao.leetcode.string;

public class NO657JudgeRouteCircle {
	 public boolean judgeCircle(String moves) {
	        if(moves==null||moves.length()==0){
	            return false;
	        }
	        int[] map = new int[4];
	        for(int i = 0;i<moves.length();i++){
	            switch(moves.charAt(i)){
	                case 'U':map[0]++;break;
	                case 'D':map[1]++;break;
	                case 'L':map[2]++;break;
	                case 'R':map[3]++;break;
	            }
	        }
	        if(map[0]==map[1]&&map[2]==map[3]){
	            return true;
	        }else{
	            return false;
	        }
	        
	    }

}
