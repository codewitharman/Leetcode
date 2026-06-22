class Solution {
    public double minimumAverage(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        Collections.sort(list);
        double minAvg = Double.MAX_VALUE;
        while (!list.isEmpty()) {
            int min = list.remove(0);
            int max = list.remove(list.size() - 1);

            double avg = (min + max) / 2.0;
            minAvg = Math.min(minAvg, avg);

        }

        return minAvg;

    }
}