class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int ws=n-k;
        int total=0;
        int ans=0;
        for(int i=0;i<ws;i++){
            ans+=cardPoints[i];
            total+=cardPoints[i];
        }
        int mini=ans;

        for(int i=ws;i<n;i++){
            ans=ans+cardPoints[i]-cardPoints[i-ws];
            total+=cardPoints[i];
            mini=Math.min(mini,ans);
        }
        return total-mini;
    }
}