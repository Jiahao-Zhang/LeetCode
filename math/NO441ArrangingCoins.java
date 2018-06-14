package pers.jiahao.leetcode.math;

public class NO441ArrangingCoins {
	public int arrangeCoins(int n) {
        return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    }

}
