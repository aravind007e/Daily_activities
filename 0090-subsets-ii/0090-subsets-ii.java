class Solution {
    static void fun(int s,int []nums,List<Integer> ans,List<List<Integer>> result){
        result.add(new ArrayList<>(ans));
        for(int i=s;i<nums.length;i++){
            if(i>s&& nums[i]==nums[i-1]) continue;
            ans.add(nums[i]);
            fun(i+1,nums,ans,result);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        fun(0,nums,ans,result);
        return result;
    }
}