class Solution {
    public String reverseByType(String s) {
        Stack<Character> lower = new Stack<>(), other = new Stack<>();

        for (char ch : s.toCharArray())
            (Character.isLowerCase(ch) ? lower : other).push(ch);

        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray())
            ans.append((Character.isLowerCase(ch) ? lower : other).pop());

        return ans.toString();
    }
}