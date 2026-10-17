class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans=0;
        int n=fruits.length;
        boolean[] check=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!check[j] && fruits[i]<=baskets[j]){
                    ans++;
                    check[j]=true;
                    break;
                }
            }
        }
        return n-ans;

    }
}