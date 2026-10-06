class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        int maxi=nums.length/3;
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:h.entrySet()){
           if(m.getValue()>maxi) ans.add(m.getKey());
        }
        return ans;

    }
}