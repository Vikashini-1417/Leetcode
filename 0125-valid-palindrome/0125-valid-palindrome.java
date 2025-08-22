class Solution {
    public boolean isPalindrome(String s) {
        String res= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev=new StringBuilder(res).reverse().toString();
        if (res.equals(rev)){
            return true;
        }
       return false; 
    }
}