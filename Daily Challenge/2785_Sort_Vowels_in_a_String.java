class Solution {
    public String sortVowels(String s) {
        // Step 1: Extract vowels
        List<Character> vowelsList = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowelsList.add(ch);
            }
        }

        // Step 2: Sort vowels by ASCII
        Collections.sort(vowelsList);

        // Step 3: Reconstruct string
        StringBuilder result = new StringBuilder();
        int j = 0; // index for sorted vowels
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                result.append(vowelsList.get(j++));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Helper function to check vowels
    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
