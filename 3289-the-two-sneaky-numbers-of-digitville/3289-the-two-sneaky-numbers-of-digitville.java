class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int[] freq = new int[100];
        for (int num : nums) {
            freq[num]++;
        }
        //System.out.println(Arrays.toString(freq));
        int index = 0;
        int result[] = new int[2];
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                result[index++] = i;
            }
        }
        return result;

    }
}