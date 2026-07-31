class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        for (int num : nums) 
            set.add(num);
        

        for (int i = min; i <= max; i++) 
            if (!set.contains(i)) 
                list.add(i);
            
        

        return list;
    }
}