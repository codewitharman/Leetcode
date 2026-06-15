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
            if (map.containsKey(formattedEmail)) {
                map.put(formattedEmail, map.get(formattedEmail) + 1);
            } else {
                map.put(formattedEmail, 1);
            }
        }
        return map.size();
    }
}