package pers.jiahao.leetcode.math;

public class NO517SuperWashingMachines {
	public int findMinMoves(int[] machines) {
        if(machines==null){
            return -1;
        }
        if(machines.length==0){
            return 0;
        }
        int sum = 0;
        int result = 0;
        for(int i = 0;i<machines.length;i++){
            sum+=machines[i];
        }
        if(sum%machines.length!=0){
            return -1;
        }else{
            int number = sum/machines.length;
            int cur = 0;
           // machines[0] = machines[0]-number;
           // result = Math.abs(machines[0]);
            for(int i = 0;i<machines.length;i++){
                int diff = machines[i]-number;
                result = Math.max(result,diff);
                cur+=diff;
                result = Math.max(Math.abs(cur),result);
            }
        }
        return result;
    }

}
