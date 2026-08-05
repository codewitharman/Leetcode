class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) 
                common.add(num);
            
        }

        int sum1 = 0, sum2 = 0;
        for (int num : common) {
            sum1 = sum1 + map1.get(num);
            sum2 = sum2 + map2.get(num);
        }
        
        return new int[] { sum1, sum2 };

    }
}