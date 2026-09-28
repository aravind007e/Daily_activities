class Solution {
    public int compress(char[] chars) {
        int read=0;
        int write=0;
        while(read<chars.length){
            int curr=chars[read];
            int count=0;

            while(read<chars.length && chars[read]==curr){
                read++;
                count++;
            }
            chars[write++]=(char)curr;
            if(count>1){
                String num=String.valueOf(count);
                for(char c:num.toCharArray()){
                    chars[write++]=c;
                }
            }
        }
        return write;
    }
}