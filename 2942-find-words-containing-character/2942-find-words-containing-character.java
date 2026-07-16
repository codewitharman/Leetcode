class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        String target = String.valueOf(x);
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.contains(target))
                list.add(i);
        }

        return list;
    }
}