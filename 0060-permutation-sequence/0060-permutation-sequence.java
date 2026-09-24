class Solution {
    int count=0;
    String result="";
     void fun(int k,String ss,String ans){
          if(ss.length()==0){
             count++;
             if(count==k){
                result=ans;
             }
             return;
          }
          for(int j=0;j<ss.length();j++){
          char c=ss.charAt(j);
          String rem=ss.substring(0,j)+ss.substring(j+1);
          fun(k,rem,ans+c);
          if(!result.equals("")) return;
          }
    }
    public String getPermutation(int n, int k) {
        if(n==1) return "1";
        StringBuilder s=new StringBuilder();
        for(int i=1;i<=n;i++){
            s.append(String.valueOf(i));
        }
        if(k==1) return s.toString();
        String ss=s.toString();
        fun(k,ss,"");
        return result;
    }
}