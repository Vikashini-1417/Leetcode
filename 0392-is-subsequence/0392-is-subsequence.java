class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int j = 0; 

        for (int i = 0; i < sLen; i++) {
            char c = s.charAt(i);
            
             while (j < tLen && t.charAt(j) != c) {
                j++;
            }

            if (j == tLen) {
                return false;
            }

            j++;
        }
        return true;
    }
}
