class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        if (num == 0)
            return true;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        int againRev = 0;
        while (rev > 0) {
            int digit = rev % 10;
            againRev = againRev * 10 + digit;
            rev = rev / 10;
        }
        return againRev == temp;
    }
}