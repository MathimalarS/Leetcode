class Solution {
    public int numOfWays(int n) {
        final int MOD = 1_000_000_007;

        long typeA = 6; 
        long typeB = 6; 

        for (int i = 2; i <= n; i++) {
            long newA = (2 * typeA + 2 * typeB) % MOD;
            long newB = (2 * typeA + 3 * typeB) % MOD;
            typeA = newA;
            typeB = newB;
        }

        return (int)((typeA + typeB) % MOD);
    }
}
