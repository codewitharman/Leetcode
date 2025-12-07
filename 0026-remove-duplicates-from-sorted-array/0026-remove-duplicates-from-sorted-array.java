class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int num: nums){
            set.add(num);
        }

        int index=0;
        for(int element:set){
            nums[index++]=element;            
        }

        return index;
    }
}