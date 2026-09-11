class Solution {
    public int totalNumbers(int[] digits) {
        int fre[]=new int[10];
        for(int i:digits){
            fre[i]++;
        }
        int count=0;
        for(int i=1;i<10;i++){
            if(fre[i]==0) continue;
            fre[i]--;
            for(int j=0;j<10;j++){
                if(fre[j]==0) continue;
                fre[j]--;
                for(int k=0;k<=8;k+=2){
                    if(fre[k]>0) {
                        count++;
                    }
                }
                fre[j]++;
            }
            fre[i]++;
        }
        return count;
    }
}