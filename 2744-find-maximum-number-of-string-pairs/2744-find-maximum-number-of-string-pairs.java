class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Map<String, String> map = new HashMap<>();
        for (String word : words) {
            String rev = reverse(word);
            map.put(word, rev);
        }
        int count = 0;
        for (Map.Entry<String, String> e : map.entrySet()) {
            String key = e.getKey();
            String rev = e.getValue();
            if (!key.equals(rev) && map.containsKey(rev)) {
                count++;
            }
        }
        return count / 2;
    }

    public String reverse(String word) {
        StringBuffer sb = new StringBuffer(word);
        return sb.reverse().toString();
    }
}