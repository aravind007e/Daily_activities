class Solution {
    public int[] resultArray(int[] nums) {
        int len=nums.length;
        int []arr1=new int[len];
        int [] arr2=new int[len];

        int i=0;
        int j=0;
        arr1[i++]=nums[0];
        arr2[j++]=nums[1];

        for(int k=2;k<len;k++){
            if(arr1[i-1]>arr2[j-1]){
                arr1[i++]=nums[k];
            }
            else{
                arr2[j++]=nums[k];
            }
        }
        int ans[]=new int[len];
        int l=0;
        for(int k=0;k<i;k++){
           ans[l++]=arr1[k];
        }
        for(int k=0;k<j;k++){
            ans[l++]=arr2[k];
        }
        return ans;
    }
}