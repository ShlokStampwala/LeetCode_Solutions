//@medium //Topic=Dynamic Programming
class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1_000_000_007;
        long[] dp = new long[n + 1]; // dp[i] = new people who learn on day i
        dp[1] = 1; 

        long share = 0; // number of people who can share on current day

        for (int day = 2; day <= n; day++) {
            // add people who became eligible to share today
            if (day - delay >= 1) {
                share = (share + dp[day - delay]) % MOD;
            }
            // remove people who forgot today
            if (day - forget >= 1) {
                share = (share - dp[day - forget] + MOD) % MOD;
            }
            // these "sharers" create new people today
            dp[day] = share;
        }

        long result = 0;
        // count only people who still remember at the end
        for (int i = n - forget + 1; i <= n; i++) {
            if (i >= 1) {
                result = (result + dp[i]) % MOD;
            }
        }

        return (int) result;
    }
}
