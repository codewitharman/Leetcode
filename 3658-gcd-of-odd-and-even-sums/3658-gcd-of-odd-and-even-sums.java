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
        while (evenSum != 0) {
            int temp = evenSum;
            evenSum = oddSum % evenSum;
            oddSum = temp;
        }

        return Math.abs(oddSum);
    }
}