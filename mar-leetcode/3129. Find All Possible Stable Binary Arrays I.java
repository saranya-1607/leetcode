/////////////////brute force ///////////////////////////
TLE WILL COME:

class Solution {

    int count = 0;
    int MOD = 1_000_000_007;

    public int numberOfStableArrays(int zero, int one, int limit) {
        backtrack(zero, one, limit, -1, 0);
        return count;
    }

    void backtrack(int zero, int one, int limit, int last, int streak) {

        if (zero == 0 && one == 0) {
            count = (count + 1) % MOD;
            return;
        }

        // place 0
        if (zero > 0) {
            if (last != 0 || streak < limit) {
                backtrack(zero - 1, one, limit, 0,
                        last == 0 ? streak + 1 : 1);
            }
        }

        // place 1
        if (one > 0) {
            if (last != 1 || streak < limit) {
                backtrack(zero, one - 1, limit, 1,
                        last == 1 ? streak + 1 : 1);
            }
        }
    }
}
