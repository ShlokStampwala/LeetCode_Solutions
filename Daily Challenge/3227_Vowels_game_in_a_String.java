class Solution {
    //@Shlok Stampwala
    public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                return true; //if vowel
            }
        }
        return false;
    }

    // isVowel for checking
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
