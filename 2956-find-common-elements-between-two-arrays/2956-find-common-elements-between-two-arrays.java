class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num))
                common.add(num);

        }

        int freq1[] = new int[101];
        int freq2[] = new int[101];
        for (int num : nums1) {
            freq1[num]++;
        }
        for (int num : nums2) {
            freq2[num]++;
        }

        int sum1 = 0, sum2 = 0;

        for (int num : common) {
            sum1 += freq1[num];
            sum2 += freq2[num];
        }

        return new int[] { sum1, sum2 };

    }
}