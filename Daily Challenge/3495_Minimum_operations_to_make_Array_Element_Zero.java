class Solution {
    // Helper to compute total cost up to n
    private long totalCostUpto(long n) {
        if (n <= 0)
            return 0;

        long total = 0;
        long power = 1;
        long cost = 1;

        // Add full blocks [4^k, 4^(k+1)-1]
        while (power * 4 <= n) {
            total += (power * 4 - power) * cost;
            power *= 4;
            cost++;
        }

        // Add remaining numbers in the last block
        total += (n - power + 1) * cost;
        return total;
    }

    public long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] q : queries) {
            int l = q[0], r = q[1];
            long totalCost = totalCostUpto(r) - totalCostUpto((long) l - 1);
            ans += (totalCost + 1) / 2; // ceil division
        }
        return ans;
    }

    // For quick testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] queries1 = { { 1, 2 }, { 2, 4 } };
        int[][] queries2 = { { 2, 6 } };

        System.out.println(sol.minOperations(queries1)); // 3
        System.out.println(sol.minOperations(queries2)); // 4
    }
}
