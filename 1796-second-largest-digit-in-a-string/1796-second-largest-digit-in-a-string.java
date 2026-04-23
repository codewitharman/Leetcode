class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                set.add(ch - '0');
            }
        }

        int nums[] = new int[set.size()];

        int index = 0;
        for (int num : set) {
            nums[index++] = num;
        }
        int largest = -1, secondLargest = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }
}