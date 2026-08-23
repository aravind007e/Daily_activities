class Solution {
    public boolean sumGame(String num) {
        int left=0;
        int right=0;
        int leftsum=0;
        int rightsum=0;
        int n=num.length();
        for(int c=0;c<n/2;c++){
            if(num.charAt(c)=='?') left++;
            else leftsum+=num.charAt(c)-'0';
        }
        for(int c=n/2;c<n;c++){
            if(num.charAt(c)=='?') right++;
            else rightsum+=num.charAt(c)-'0';
        }

        if((left+right)%2==1) return true;

        return leftsum-rightsum!=(right-left)/2*9;
    }
}