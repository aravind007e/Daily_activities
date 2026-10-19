class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int i=0;
        int maxi=0;
        int ans=0;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int j=0;j<n;j++){
            char ch=s.charAt(j);
            h.put(ch,h.getOrDefault(ch,0)+1);
            ans=Math.max(ans,h.get(ch));
            while((j-i+1)-ans>k){
                char c=s.charAt(i);
                h.put(c,h.get(c)-1);
                if(h.get(c)==0) h.remove(c);
                i++;
            }
            maxi=Math.max(maxi,j-i+1);
        }
        return maxi;
    }
}