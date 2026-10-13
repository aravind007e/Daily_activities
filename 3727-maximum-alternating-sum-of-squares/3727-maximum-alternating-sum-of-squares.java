class Solution {
    public long maxAlternatingSum(int[] nums) {
         Integer[] arr = Arrays.stream(nums)
                                    .boxed()
                                    .toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
        long ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long ele=(long) arr[i] * arr[i];
            if(i<n/2) ans-=ele;
            else ans+=ele;
        }
        return ans;
    }
}