class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int maxi=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push('(');
            else if(s.charAt(i)==')') st.pop();
            maxi=Math.max(maxi,st.size());
        }
        return maxi;
    }
}