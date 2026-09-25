class Solution {
    void rotate1(int[]nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
         k=k%nums.length;
         int n=nums.length;
        rotate1(nums,0,n-1);
        rotate1(nums,0,k-1);
        rotate1(nums,k,n-1);
    }
}