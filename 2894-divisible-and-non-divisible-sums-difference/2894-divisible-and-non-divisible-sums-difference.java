class Solution {
    public int differenceOfSums(int n, int m) {
        int total = n * (n + 1) / 2;
        int key = n / m;
        int res = m * key * (key + 1) / 2;
        return total - 2 * res;
    }
}