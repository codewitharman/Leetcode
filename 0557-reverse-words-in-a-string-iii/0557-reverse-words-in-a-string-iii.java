class Solution {
    public String reverseWords(String s) {
        String[] wordsArray = s.trim().split("\\s+"); //spilt on the basis of spaces
        List<String> wordsList = Arrays.asList(wordsArray);
        String res = "";
        for (String word : wordsList) {
            StringBuilder sb = new StringBuilder(word);
            res = res + sb.reverse() + " ";

        }
        return res.trim();
    }
}