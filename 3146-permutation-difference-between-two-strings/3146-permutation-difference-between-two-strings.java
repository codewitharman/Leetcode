class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> tMap = new HashMap<>();
        int j = 0;
        for (char ch : t.toCharArray())
            tMap.put(ch, j++);

        int sum = 0;
        for (int k = 0; k < s.length(); k++)
            sum += Math.abs(k - tMap.get(s.charAt(k)));

        return sum;

    }
}