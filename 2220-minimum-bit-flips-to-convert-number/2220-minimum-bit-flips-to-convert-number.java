class Solution {
    public int minBitFlips(int start, int goal) {
        String binaryStart = Integer.toBinaryString(start);
        String binaryGoal = Integer.toBinaryString(goal);

        int maxLen = Math.max(binaryStart.length(), binaryGoal.length());
        binaryStart = String.format("%" + maxLen + "s", binaryStart).replace(' ', '0');
        binaryGoal = String.format("%" + maxLen + "s", binaryGoal).replace(' ', '0');

        int count = 0;
        for (int i = 0; i < maxLen; i++) {
            if (binaryStart.charAt(i) != binaryGoal.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}