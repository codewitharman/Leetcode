import java.util.*;

class Solution {
    public int search(int[] nums, int target) {
        OptionalInt foundIndex = IntStream.range(0, nums.length)
                .filter(i -> nums[i] == target)
                .findFirst();

        if (foundIndex.isPresent()) {
            return foundIndex.getAsInt();
        } else {
            return -1;
        }
    }
}