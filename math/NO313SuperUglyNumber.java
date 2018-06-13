package pers.jiahao.leetcode.math;

public class NO313SuperUglyNumber {
	public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        ugly[0] = 1;
        for(int i = 1;i<n;i++){
            ugly[i] = Integer.MAX_VALUE;
            for(int j = 0;j<primes.length;j++){
                ugly[i] = Math.min(ugly[i],primes[j]*ugly[index[j]]);
            }
            for(int j = 0;j<primes.length;j++){
                while(primes[j]*ugly[index[j]]<=ugly[i]){
                    index[j]++;
                }
            }
        }
        return ugly[n-1];
        
    }

}
