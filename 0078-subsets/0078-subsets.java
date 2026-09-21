class Solution {
    static void fun(int i,int[] arr,int n,List<Integer> ans,List<List<Integer>> result){
        if(i>=n){
             result.add(new ArrayList<>(ans));
             return;
        }

        ans.add(arr[i]);
        fun(i+1,arr,n,ans,result);
        ans.remove(ans.size()-1);
        fun(i+1,arr,n,ans,result);
    } 
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        fun(0,nums,n,ans,result);
        return result;
    }
}