class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int tank=0;
        int s=0;
        for(int i=0;i<gas.length;i++){
            int k=gas[i]-cost[i];
            total+=k;
            tank+=k;
            if(tank<0){
                s=i+1;
                tank=0;
            }
        }
        return total>=0? s:-1;
    }
}