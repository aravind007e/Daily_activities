class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        int [] m=new int[n];

        for(int i=0;i<n;i++){
            int k=0;

            for(char c:words[i].toCharArray()){
                k|=1<<(c-'a');
            }
            m[i]=k;
        }

        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((m[i] & m[j])==0){
                    int p=words[i].length()*words[j].length();

                    max=Math.max(max,p);
                }
            }
        }
        return max;
    }
}