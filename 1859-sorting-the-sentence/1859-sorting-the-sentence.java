class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        List<String> list = new ArrayList<>(Collections.nCopies(words.length, ""));

        for (String word : words) {
            int pos = word.charAt(word.length() - 1) - '1';
            list.set(pos, word.substring(0, word.length() - 1));
        }
        return String.join(" ", list);

    }
}