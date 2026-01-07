class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                return num;
            } else {
                set2.add(num);
            }
        }
        return -1;
    }
}