class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) 
            set1.add(num);
        

        for (int num : nums2) 
            set2.add(num);
        
        int sum1 = 0, sum2 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) {
                sum1++;
            }
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                sum2++;
            }
        }
        return new int [] {sum1,sum2};
    }
}