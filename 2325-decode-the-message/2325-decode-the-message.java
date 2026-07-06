class Solution {
    public String decodeMessage(String key, String message) {
        key = key.replace(" ", "");
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : key.toCharArray()) {
            set.add(ch);
        }
        char[] arr = new char[set.size()];
        int index = 0;
        for (char ch : set) {
            arr[index++] = ch;
        }

        char[] words = new char[26];
        char ch = 'a';
        for (int i = 0; i < words.length; i++) {
            words[i] = ch;
            ch++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char m = message.charAt(i);
            if (m == ' ') {
                sb.append(' ');
            } else {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == m) {
                        sb.append(words[j]);
                        break;
                    }
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        //System.out.print(Arrays.toString(words));
        return sb.toString();

    }
}