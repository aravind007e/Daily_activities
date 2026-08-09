class Solution {
    public int lengthOfLastWord(String s) {
        String[]arr=s.split(" ");
        int k=arr.length;
        String n=arr[k-1];
        return n.length();
    }
}