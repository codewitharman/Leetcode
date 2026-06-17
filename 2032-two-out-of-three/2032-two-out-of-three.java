class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        Set<Integer> result = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : nums3) {
            set3.add(num);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            if (set2.contains(nums3[i])) {
                result.add(nums3[i]);
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            if (set3.contains(nums1[i])) {
                result.add(nums1[i]);
            }
        }

        return new ArrayList<>(result);

    }
}