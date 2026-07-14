class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> H=new HashMap<>();
        for(char c:s.toCharArray()){
            H.put(c,H.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> p=new PriorityQueue<>((a,b) -> H.get(b)- H.get(a));
        p.addAll(H.keySet());

        StringBuilder k=new StringBuilder();

        while(!p.isEmpty()){
            char c=p.poll();

            for(int i=0;i<H.get(c);i++){
                k.append(c);
            }
        }
        return k.toString();
    }
}