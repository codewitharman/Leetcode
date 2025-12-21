import java.util.Arrays;

class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        if (piles == null || piles.length == 0) return 0;

        int maxPile = Arrays.stream(piles).max().getAsInt();
        int start = 1, end = maxPile;
        int ans = maxPile;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long totalHours = calculateTotalHours(piles, mid);

            if (totalHours <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public long calculateTotalHours(int[] piles, int hourly) {
        long totalHours = 0;
        for (int banana : piles) {
            totalHours += (banana + hourly - 1) / hourly; // integer ceil
        }
        return totalHours;
    }
}
