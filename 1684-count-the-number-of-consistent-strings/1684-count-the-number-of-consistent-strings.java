class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            String stripped = word.replaceAll("[" + allowed + "]", "");
            if (stripped.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}