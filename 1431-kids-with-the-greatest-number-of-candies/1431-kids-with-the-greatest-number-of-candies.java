class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int n=candies.length;
        int maxi=0;
        for(int i=0;i<n;i++){
           if(maxi<candies[i]) maxi=candies[i];
        }
        for(int i=0;i<n;i++){
            boolean check=candies[i]+extraCandies>=maxi ? true : false;
            ans.add(check);
        }
        return ans;
    }
}