class Solution {
    public int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int missing = arr[i] - (i + 1);
            if (missing >= k) {
                {
                    return k + i;
                }
            }

        }
        int totalMissing = arr[arr.length - 1] - arr.length;
        int remaining = k - totalMissing;
        return arr[arr.length - 1] + remaining;
    }
}