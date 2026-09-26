class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] check=new boolean[26];
        for(char c:sentence.toCharArray()){
            check[c-'a']=true;
        }
        for(int i=0;i<26;i++){
            if(!check[i]) return false;
        }
        return true;
    }
}