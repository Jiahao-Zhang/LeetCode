package pers.jiahao.leetcode.tree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null||nums.length==0){
            return null;
        }
        return buildTree(0,nums.length-1,nums);
    }
    public TreeNode buildTree(int start,int end,int[] nums){
        if(start>=nums.length||start>end){
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = start;i<=end;i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
            
        }
        TreeNode node = new TreeNode(max);
        node.right = buildTree(index+1,end,nums);
        node.left = buildTree(start,index-1,nums);
        return node;
    }
}
