class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";

        int [] f=new int[128];
        for(char c:t.toCharArray()){
            f[c]++;
        }

        int left=0;
        int right=0;
        int count=t.length();
        int minlen=Integer.MAX_VALUE;
        int start=0;

        while(right<s.length()){
            char ch=s.charAt(right);

            if(f[ch]>0) count--;

            f[ch]--;
            right++;

            while(count==0){
                if(right-left<minlen){
                    minlen=right-left;
                    start=left;
                }

                char leftchar=s.charAt(left);
                f[leftchar]++;

                if(f[leftchar]>0) count++;
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE ? "":s.substring(start,start+minlen);
    }
}