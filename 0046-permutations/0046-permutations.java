class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,nums,new ArrayList(),new boolean[nums.length]);
        return result;
    }
    static void backtrack(List<List<Integer>> result,int [] nums,List<Integer> temp, boolean arr[]){
           if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
           }
           for(int i=0;i<nums.length;i++){
            if(arr[i]){
                continue;
            }
            arr[i]=true;
            temp.add(nums[i]);
           backtrack(result,nums,temp,arr);
           arr[i]=false;
           temp.remove(temp.size()-1);
           }
           }
} 