class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            StringBuilder sb = new StringBuilder(str);

            result.append(reverseString(sb));  // now it returns something

            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String reverseString(StringBuilder sb) {
        int start = 0;
        int end = sb.length() - 1;

        while (start <= end) {
            char startChar = sb.charAt(start);
            char endChar = sb.charAt(end);

            sb.setCharAt(start, endChar);
            sb.setCharAt(end, startChar);

            start++;
            end--;
        }

        return sb.toString();
    }
}