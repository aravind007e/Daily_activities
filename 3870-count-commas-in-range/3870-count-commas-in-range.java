class Solution {
    public int countCommas(int n) {
        if(n<=999) return 0;
        int count=0;
        for(int i=1000;i<=n;i++){
            if(i<1000000) count++;
            else{
                String s=String.valueOf(i);
                int len=s.length();
                count+=(len/3);
            }
        }
        return count;
    }
}