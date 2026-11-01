class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans=0;
        int profit=0;
        int mini=prices[0];
        int maxi=0;
        for(int i=1;i<n;i++){
           if(prices[i]<mini){ 
            ans+=profit;
            profit=0;
            mini=prices[i];
            maxi=0;
           }
           else if(prices[i]>maxi){
            maxi=prices[i];
             profit=Math.max(profit,maxi-mini);
           }
           else{
            ans+=profit;
            profit=0;
            mini=prices[i];
            maxi=0;
           }
           
        }
        if(profit>0) ans+=profit;
        return ans;
    }
}