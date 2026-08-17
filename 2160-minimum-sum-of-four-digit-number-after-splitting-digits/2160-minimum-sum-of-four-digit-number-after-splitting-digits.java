import java.util.*;

class Solution {
    public int minimumSum(int num) {

        int nums[] = new int[4];
        int index = 0;
        while (num > 0) {
            int digit = num % 10;
            nums[index++] = digit;
            num = num / 10;
        }
        Optional<Integer> smallest = Arrays.stream(nums).boxed()
                .sorted()
                .findFirst();

        Optional<Integer> secondSmallest = Arrays.stream(nums).boxed()
                .sorted()
                .skip(1)
                .findFirst();

        Optional<Integer> largest = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .findFirst();

        Optional<Integer> secondLargest = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        int result = ((smallest.orElse(0) * 10) + largest.orElse(0))
                + ((secondSmallest.orElse(0) * 10) + secondLargest.orElse(0));
        return result;
    }
}