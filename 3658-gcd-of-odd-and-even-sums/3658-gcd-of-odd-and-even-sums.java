class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = 0, oddSum = 0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddSum = oddSum + i;
            }
        }
        int gcd = 0;
        for (int i = 1; i <= evenSum && i <= oddSum; i++) {
            if (evenSum % i == 0 && oddSum % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}