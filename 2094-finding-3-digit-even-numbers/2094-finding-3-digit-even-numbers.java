class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int fre[]=new int[10];
        for(int i:digits){
            fre[i]++;
        }
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=100;i<=998;i+=2){
            int a=i/100;
            int b=(i/10) %10;
            int c=i%10;

            fre[a]--;
            fre[b]--;
            fre[c]--;
            if(fre[a]>=0 && fre[b]>=0 && fre[c]>=0) ans.add(i);
            fre[a]++;
            fre[b]++;
            fre[c]++;
        }
        int []result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}