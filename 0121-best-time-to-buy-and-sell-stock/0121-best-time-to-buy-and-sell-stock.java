class Solution {
    public int maxProfit(int[] prices) {
       int mini=Integer.MAX_VALUE;
       int profit=0;
       for(int i:prices){
         mini=Math.min(mini,i);
         profit=Math.max(profit,i-mini);
       } 
       return profit;
    }
}