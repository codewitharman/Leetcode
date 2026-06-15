class Solution {
    public int numUniqueEmails(String[] emails) {
        Map<String, Integer> map = new HashMap<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            int plusSignIndex = local.indexOf('+');
            if (plusSignIndex != -1) {
                local = local.substring(0, plusSignIndex); //first part aaya
            }
            local = local.replace(".", "");
            String formattedEmail = local + "@" + domain;
            map.put(formattedEmail, map.getOrDefault(formattedEmail, 0) + 1);
        }

        return map.size();
    }
}