class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        //System.out.println(map);
        return 0;
    }
}