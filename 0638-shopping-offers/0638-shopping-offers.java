class Solution {
    HashMap<List<Integer>,Integer> memo=new HashMap<>();
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        if (memo.containsKey(needs)) {
            return memo.get(needs);
        }
        int n = price.size();
        int minCost = 0;
        for (int i = 0; i < n; i++) {
            minCost += needs.get(i) * price.get(i);
        }
            for (List<Integer> offer : special) {
                boolean possible = true;
                List<Integer> remaining = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (offer.get(i) > needs.get(i)) {
                        possible = false;
                        break;
                    }                                                                                               remaining.add(needs.get(i) - offer.get(i));
                }

                if (possible) {
                    int cost = offer.get(n) +shoppingOffers(price, special, remaining);
                    minCost = Math.min(minCost, cost);
                }
         }

        memo.put(needs, minCost);
        return minCost;
        }}