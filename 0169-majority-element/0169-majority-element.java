//Moores voting algo-->technodage
class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int point = 0;
        for (int num : nums) {
            if (point == 0) {
                candidate = num;
            }

            if (candidate == num) {
                point++;
            } else {
                point--;
            }
        }

        return candidate;
    }

}

