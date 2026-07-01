class Solution {
    public String reverseByType(String s) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (char ch : s.toCharArray()) {
            ((ch >= 'a' && ch <= 'z') ? st1 : st2).push(ch);
        }

        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            ans = ans + ((ch >= 'a' && ch <= 'z') ? st1.pop() : st2.pop());
        }

        return ans;

    }
}