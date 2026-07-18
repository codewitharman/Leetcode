class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int[] temp = new int[candies.length];
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
            temp[i] = candies[i] + extraCandies;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= max)
                list.add(true);
            else
                list.add(false);
        }

        return list;
    }
}