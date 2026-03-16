class Solution {
    public boolean isPalindrome(String s) {
        // convert to lowercase
        s = s.toLowerCase();
        // remove all non-alphanumeric characters
        s = s.replaceAll("[^a-z0-9]", "");
        // reverse the string
        String reversed = new StringBuilder(s).reverse().toString();
        // check if both are equal
        return s.equals(reversed);
    }
}