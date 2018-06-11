package pers.jiahao.leetcode.math;

public class NO593ValidSquare {
	public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double length1 = getLength(p1,p2);
        double length2 = getLength(p1,p3);
        double length3 = getLength(p1,p4);
        int[] oppo1 = null;
        int[] oppo2 = null;
        int[] oppo3 = null;
        int[] oppo4 = null;
        if(length1==length2){
            oppo1 = p1;
            oppo2 = p4;
            oppo3 = p2;
            oppo4 = p3;
        }else if(length2==length3){
            oppo1 = p1;
            oppo2 = p2;
            oppo3 = p3;
            oppo4 = p4;
        }else if(length1==length3){
            oppo1 = p1;
            oppo2 = p3;
            oppo3 = p2;
            oppo4 = p4;
        }else{
            return false;
        }
        double diongal1 = getLength(oppo1,oppo2);
        double diongal2 = getLength(oppo3,oppo4);
        double side1 = getLength(oppo1,oppo3);
        double side2 = getLength(oppo1,oppo4);
        double side3 = getLength(oppo2,oppo3);
        double side4 = getLength(oppo2,oppo4);
        
        if(diongal1!=diongal2){
            return false;
        }else{
            if(side1==side2&&side2==side3&&side3==side4&&side1!=0){
                return true;
            }else{
                return false;
            }
        }
        
       
        
    }
    private double getLength(int[] p1,int[] p2){
        int x1 = p1[0];
        int y1 = p1[1];
        int x2 = p2[0];
        int y2 = p2[1];
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }

}
