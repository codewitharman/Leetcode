class Solution {
    public int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int actualNumber=arr[i];
            int expectedNumber=i + 1;
            int missing = actualNumber - expectedNumber;
            if (missing >= k) {
                {
                    return k + i;
                }
            }

        }
        int n=arr.length;
        int totalMissing = arr[n - 1] - n;
        int remaining = k - totalMissing;
        return arr[arr.length - 1] + remaining;
    }
}