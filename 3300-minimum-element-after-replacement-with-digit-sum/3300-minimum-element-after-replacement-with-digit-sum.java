class Solution {
    public int minElement(int[] nums) {
        int index = 0;
        for (int num : nums) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
            nums[index++] = sum;
        }
        int min = Integer.MAX_VALUE;
        for (int num : nums) 
            min = Math.min(min, num);
        
        return min;
    }
}