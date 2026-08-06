class Solution {
    public int minElement(int[] nums) {
        int temp[] = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
            temp[index++] = sum;
        }
        int min = Integer.MAX_VALUE;
        for (int num : temp) 
            min = Math.min(min, num);
        
        return min;

    }
}