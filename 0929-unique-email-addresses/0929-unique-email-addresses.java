class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            set.add(processedEmail(email));
        }
        return set.size();
    }

    public String processedEmail(String email) {
        int domainIndex = email.indexOf("@");
        StringBuilder sb = new StringBuilder(email.length());
        for (int i = 0; i < domainIndex; i++) {
            char ch = email.charAt(i);
            if (ch == '+') {
                break;
            }
            if (ch != '.') {
                sb.append(ch);
            }
        }
        sb.append(email.substring(domainIndex));
        return sb.toString();
    }
}