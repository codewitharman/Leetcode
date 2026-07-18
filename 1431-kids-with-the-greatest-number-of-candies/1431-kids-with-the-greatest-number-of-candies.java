class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> list = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) 
            max = Math.max(candies[i], max);
        

        for (int candy: candies) {
            if (candy + extraCandies >= max)
                list.add(true);
            else
                list.add(false);
        }

        return list;
    }
}