class Solution {
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
    }

private void merge(int[] nums,int left,int right){
    if(left>=right) return;

    int mid=left+(right-left)/2;
    merge(nums,left,mid);
    merge(nums,mid+1,right);
    mergesort(nums,left,mid,right);
}
private void mergesort(int[] nums,int left,int mid,int right){
    int [] t=new int[right-left+1];

    int i=left;
    int j=mid+1;
    int k=0;

    while(i<=mid && j<=right){
        if(nums[i]<=nums[j]){
            t[k++]=nums[i++];
        }
        else{
            t[k++]=nums[j++];
        }
    }
    while(i<=mid){
        t[k++]=nums[i++];
    }
    while(j<=right){
        t[k++]=nums[j++];
    }
    for( i=0;i<t.length;i++){
        nums[left+i]=t[i];
    }
}

}