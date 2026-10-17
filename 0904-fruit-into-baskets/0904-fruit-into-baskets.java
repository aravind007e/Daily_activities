class Solution {
    public int totalFruit(int[] fruits) {
        int maxi=0;
       HashMap<Integer,Integer> h=new HashMap<>();
       int i=0;
       int j=0;
       while(j<fruits.length){
        h.put(fruits[j],h.getOrDefault(fruits[j],0)+1);
        while(h.size()>2){
            h.put(fruits[i], h.get(fruits[i]) - 1);
            if(h.get(fruits[i])==0) h.remove(fruits[i]);
            i++;
        }
        maxi=Math.max(maxi,j-i+1);
        j++;
        }
            
                return maxi;
               
    }
}