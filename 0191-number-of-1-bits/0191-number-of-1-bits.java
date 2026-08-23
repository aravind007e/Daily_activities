class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0){
            int k=n%2;
            if(k==1) count++;
            n=n/2;
        }
        return count;
    }
}