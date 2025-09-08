class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n-a;
            if (isNoZero(a) && isNoZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{}; // though by constraint we always have a solution
    }

    // helper function to check if a number contains '0'
    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false; 
            num /= 10;
        }
        return true;
    }
}
