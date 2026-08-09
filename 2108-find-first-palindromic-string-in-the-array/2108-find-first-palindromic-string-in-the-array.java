class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean flag = true;
            int start = 0;
            int end = word.length() - 1;
            while (start < end) {
                if (word.charAt(start) != word.charAt(end)) {
                    flag = false;
                }
                start++;
                end--;
            }
            if (flag) {
                return word;
            }
            System.out.println(word);
        }
        return "";
    }
}