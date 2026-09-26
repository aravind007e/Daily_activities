class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> h=new HashMap<>();
        for(List<String> l:knowledge){
          h.put(l.get(0),l.get(1));
        }
       int n=s.length();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='('){
            StringBuilder k=new StringBuilder();
            i++;
            while(s.charAt(i)!=')'){
                k.append(s.charAt(i));
                i++;
            }
            String val=h.getOrDefault(k.toString(),"?");
            ans.append(val);
           } 
           else{
            ans.append(s.charAt(i));
           }

        }
        return ans.toString();
    }
}