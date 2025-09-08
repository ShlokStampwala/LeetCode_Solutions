class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from last digit backwards
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add 1
                return digits; // no carry, return result
            }
            digits[i] = 0;     // set to 0 and continue with carry
        }
        
        // If we are here, that means all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1; //for 9 to 10
        return result;
    }
}