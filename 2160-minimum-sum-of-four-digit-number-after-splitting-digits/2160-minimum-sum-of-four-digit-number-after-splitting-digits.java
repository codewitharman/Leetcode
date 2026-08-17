class Solution {
    public int minimumSum(int num) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int nums[] = new int[4];
        int index = 0;
        while (num > 0) {
            int digit = num % 10;
            nums[index++] = digit;
            num = num / 10;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                secondSmallest = smallest;
                smallest = nums[i];
            } else if (nums[i] < secondSmallest) {
                secondSmallest = nums[i];
            }
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        int result = ((smallest * 10) + largest) + ((secondSmallest * 10) + secondLargest);
        return result;
    }
}