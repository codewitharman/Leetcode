class Solution {
    public int reverse(int x) {
        return helper(x, 0);
    }

    private int helper(int x, int rev) {
        if (x == 0)
            return rev;

        if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && x % 10 > 7))
            return 0;
        if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && x % 10 < -8))
            return 0;

        return helper(x / 10, rev * 10 + x % 10);
    }
}
