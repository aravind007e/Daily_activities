class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int left=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
            while(h.get(s.charAt(i))>2){
                char lc=s.charAt(left);
                h.put(lc,h.get(lc)-1);

                if(h.get(lc)==0){
                    h.remove(lc);
                }
                left++;
            }
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}