package pers.jiahao.leetcode.math;

public class NO223RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int[] rec1 = {A,B,C,D};
        int[] rec2 = {E,F,G,H};
        int width1 = Math.abs(C-A);
        int height1 = Math.abs(D-B);
        int height2 = Math.abs(H-F);
        int width2 = Math.abs(G-E);
        int area = width1*height1+width2*height2;
        int right = Math.min(rec1[2],rec2[2]);
        int left = Math.max(rec1[0],rec2[0]);
        int top = Math.min(rec1[3],rec2[3]);
        int bottom = Math.max(rec1[1],rec2[1]);
        if(right>left&&top>bottom){
            area = area-((right-left)*(top-bottom));
        }
        return area;
    }

}
