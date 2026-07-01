class Solution {
    public String reverseByType(String s) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                st1.push(ch);
            } else {
                st2.push(ch);
            }
        }

        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ans = ans + st1.pop();
            } else {
                ans = ans + st2.pop();
            }
        }

        return ans;

    }
}