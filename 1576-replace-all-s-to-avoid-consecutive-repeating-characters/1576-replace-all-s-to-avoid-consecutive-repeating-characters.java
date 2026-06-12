class Solution {
    public String modifyString(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '?') {

                for (char ch = 'a'; ch <= 'z'; ch++) {

                    boolean sameAsPrev = (i > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) == ch);

                    boolean sameAsNext = (i < s.length() - 1 && s.charAt(i + 1) != '?' && s.charAt(i + 1) == ch);

                    if (!sameAsPrev && !sameAsNext) {
                        sb.append(ch);
                        break;
                    }
                }

            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}