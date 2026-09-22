class Solution {
    public int integerReplacement(int n) {
        if(n==1) return 0;
        if(n==2147483647) return 32;
        int count=0;
        if(n%2!=0){
            if(((n-1)/2)%2==0 || (n-1)/2==1) n--;
            else n++;
            count++;
        }
        while(n!=1){
            count++;
            n=n/2;
            if(n!=1 && n%2==1){
                if(((n-1)/2)%2==0 || (n-1)/2==1) n--;
                else n++;
                count++;
            }
        }
        return count;

    }
}