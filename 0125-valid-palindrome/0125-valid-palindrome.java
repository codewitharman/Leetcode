class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = cleanString.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}