class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;  // number of users
        List<Set<Integer>> langSets = new ArrayList<>();

        // Convert each user's languages to a set for fast lookup
        for (int[] langs : languages) {
            Set<Integer> set = new HashSet<>();
            for (int l : langs) {
                set.add(l);
            }
            langSets.add(set);
        }

        // Step 1: find broken friendships (no common language)
        Set<Integer> brokenUsers = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0] - 1; // convert to 0-indexed
            int v = f[1] - 1;

            Set<Integer> setU = langSets.get(u);
            Set<Integer> setV = langSets.get(v);

            boolean hasCommon = false;
            for (int l : setU) {
                if (setV.contains(l)) {
                    hasCommon = true;
                    break;
                }
            }
            if (!hasCommon) {
                brokenUsers.add(u);
                brokenUsers.add(v);
            }
        }

        // If no broken friendships → no one needs to be taught
        if (brokenUsers.isEmpty()) return 0;

        // Step 2: Try teaching each language
        int ans = Integer.MAX_VALUE;
        for (int L = 1; L <= n; L++) {
            int cnt = 0;
            for (int user : brokenUsers) {
                if (langSets.get(user).contains(L)) {
                    cnt++;
                }
            }
            int need = brokenUsers.size() - cnt;
            ans = Math.min(ans, need);
        }

        return ans;
    }
}
