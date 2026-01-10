class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = null;
        cleanString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversedStr = "";
        for (int i = cleanString.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + cleanString.charAt(i);
        }
        return cleanString.equals(reversedStr);

    }
}