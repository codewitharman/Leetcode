class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            freq[nums1[i]]++;
        }

        int result[] = new int[nums2.length];
        int k = 0;
        for (int j = 0; j < nums2.length; j++) {
            if (freq[nums2[j]] > 0) {
                result[k] = nums2[j];
                k++;
                freq[nums2[j]]--;
            }
        }

        return Arrays.copyOf(result, k);
    }
}