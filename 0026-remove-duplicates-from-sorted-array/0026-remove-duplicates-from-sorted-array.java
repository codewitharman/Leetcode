class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        int temp=0;

        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                nums[temp]=nums[i];
                temp++;
                map.put(nums[i],i);
            }
        }

        return temp;
    }
}