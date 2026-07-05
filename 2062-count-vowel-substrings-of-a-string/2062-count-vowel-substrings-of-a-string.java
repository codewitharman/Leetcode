class Solution {
    public int countVowelSubstrings(String word) {

        int n = word.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            Set<Character> hs = new HashSet<>();

            for (int j = i; j < n; j++) {
                char c = word.charAt(j);

                if (isVowel(c)) {
                    hs.add(c);

                    if (hs.size() == 5) {
                        count++;
                    }
                } else {
                    break;
                }
            }
        }
        return count;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}