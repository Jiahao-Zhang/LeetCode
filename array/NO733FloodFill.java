package pers.jiahao.leetcode.array;

public class NO733FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] used = new boolean[image.length][image[0].length];
        int color = image[sr][sc];
        image[sr][sc] = newColor; 
        used[sr][sc] = true;
        helper(image,sr-1,sc,color,newColor,used);
        helper(image,sr+1,sc,color,newColor,used);
        helper(image,sr,sc-1,color,newColor,used);
        helper(image,sr,sc+1,color,newColor,used);
        return image;
    }
    private void helper(int[][] image,int sr,int sc,int oldColor,int newColor,boolean[][] used){
        
        if(sr>=0&&sr<image.length&&sc>=0&&sc<image[0].length&&image[sr][sc]==oldColor&&!used[sr][sc]){
            image[sr][sc] = newColor;
            used[sr][sc] = true;
            helper(image,sr-1,sc,oldColor,newColor,used);
            helper(image,sr+1,sc,oldColor,newColor,used);
            helper(image,sr,sc+1,oldColor,newColor,used);
            helper(image,sr,sc-1,oldColor,newColor,used);
        }
        return;
    }

}
