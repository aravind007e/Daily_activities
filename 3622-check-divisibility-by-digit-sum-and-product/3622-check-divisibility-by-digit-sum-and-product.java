class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int mul=1;
        while(n>0){
            int k=n%10;
            sum+=k;
            mul*=k;
            n=n/10;
        }
        int ans=sum+mul;
        return num%ans==0;
         
    }
}