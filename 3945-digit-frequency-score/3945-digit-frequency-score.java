class Solution {
    public int digitFrequencyScore(int n) {
        long sum = String.valueOf(n).chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .mapToLong(e -> (e.getKey() - '0') * e.getValue())
                .sum();
        return (int) sum;
    }
}