class Solution {
    public boolean checkGoodInteger(int n) {
        int temp = n;
        int digitSum = 0, squareSum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            digitSum += digit;
            temp = temp / 10;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            squareSum = squareSum + (digit * digit);
            temp = temp / 10;
        }

        int sum = squareSum - digitSum;
        if (sum >= 50) {
            return true;
        } else {
            return false;
        }

    }
}