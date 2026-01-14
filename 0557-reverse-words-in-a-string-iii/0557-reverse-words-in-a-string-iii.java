class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            StringBuilder sb = new StringBuilder(str);

            int start = 0;
            int end = sb.length() - 1;

            while (start < end) {
                char leftChar = sb.charAt(start);
                char rightChar = sb.charAt(end);

                sb.setCharAt(start, rightChar);
                sb.setCharAt(end, leftChar);
                start++;
                end--;
            }

            result.append(sb);
            if (i < arr.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
