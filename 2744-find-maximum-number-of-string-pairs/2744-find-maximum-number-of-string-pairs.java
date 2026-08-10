class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for (String word : words) {
            set.add(word);
        }

        for (int i = 0; i < words.length; i++) {
            String rev = reverse(words[i]);
            if (!rev.equals(words[i]) && set.contains(rev) && set.contains(words[i])) {
                count++;
                set.remove(words[i]);
                set.remove(rev);
            }
        }

        return count;
    }

    public String reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}