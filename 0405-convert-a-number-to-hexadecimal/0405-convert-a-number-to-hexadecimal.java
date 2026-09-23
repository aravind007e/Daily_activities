class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        char[] c="0123456789abcdef".toCharArray();
        StringBuilder s=new StringBuilder();
        while(num!=0){
            int k=num&15;
            s.append(c[k]);
            num>>>=4;
        }
        return s.reverse().toString();
    }
}