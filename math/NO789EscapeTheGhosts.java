package pers.jiahao.leetcode.math;

public class NO789EscapeTheGhosts {
	public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int steps = Math.abs(target[0])+Math.abs(target[1]);
        for(int i = 0;i<ghosts.length;i++){
            int temp = Math.abs(ghosts[i][0]-target[0])+Math.abs(ghosts[i][1]-target[1]);
            if(temp<=steps){
                return false;
            }
        }
        return true;
    }

}
