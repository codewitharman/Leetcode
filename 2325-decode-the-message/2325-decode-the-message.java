class Solution {
    public String decodeMessage(String key, String message) {
        char[] arr1 = key.toCharArray();
        Map<Character, Character> map = new LinkedHashMap<>();
        char next = 'a';

        for (int i = 0; i < arr1.length; i++) {
            char k = arr1[i];
            if (k == ' ' || map.containsKey(k)) {
                continue;
            }
            map.put(k, next);
            next++;
        }

        char[] arr2 = message.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr2.length; i++) {
            char m = arr2[i];
            if (m == ' ') {
                sb.append(' ');
            } else {
                sb.append(map.get(m));
            }
        }
        return sb.toString();
    }
}