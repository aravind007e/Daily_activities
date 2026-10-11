class Solution {

    public String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = computeLPS(combined);

        int palindromeLen = lps[combined.length() - 1];

        return rev.substring(0, s.length() - palindromeLen) + s;
    }

    private int[] computeLPS(String str) {

        int[] lps = new int[str.length()];
        int j = 0;

        for (int i = 1; i < str.length(); i++) {

            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = lps[j - 1];
            }

            if (str.charAt(i) == str.charAt(j)) {
                j++;
            }

            lps[i] = j;
        }

        return lps;
    }
}