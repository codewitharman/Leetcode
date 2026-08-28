class Solution {
    public int pivotInteger(int n) {
        int sum = (n * (n + 1)) / 2;
        int result = (int) Math.sqrt(sum);

        while ((long) result * result > sum) result--;
        while ((long) (result + 1) * (result + 1) <= sum) result++;

        return ((long) result * result == sum) ? result : -1;
    }
}