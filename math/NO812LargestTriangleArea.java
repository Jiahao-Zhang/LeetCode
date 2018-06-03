package pers.jiahao.leetcode.math;

public class NO812LargestTriangleArea {
	public double largestTriangleArea(int[][] points) {
        double max = 0;
        for(int i = 0;i<points.length;i++){
            for(int j = i+1;j<points.length;j++){
                for(int k = j+1;k<points.length;k++){
                    double l1 = getLength(points[i],points[j]);
                    double l2 = getLength(points[i],points[k]);
                    double l3 = getLength(points[j],points[k]);
                    if(l1+l2>l3&&l2+l3>l1&&l1+l3>l2){
                        double p = (l1+l2+l3)/2;
                        double S = Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
                        if(S>max){
                            max = S;
                        }
                    }
                }
            }
        }
        return max;
        
    }
    private double getLength(int[] points1,int[] points2){
        double x = points1[0]-points2[0];
        double y = points1[1]-points2[1];
        double length = Math.sqrt(x*x+y*y);
        return length;
    }

}
