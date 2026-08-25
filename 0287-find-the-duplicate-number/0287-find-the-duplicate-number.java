class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> k:h.entrySet()){
            if(k.getValue()>1) return k.getKey();
        }
        return -1;
    }
}