class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                stack.push(ch);
            }
            if (ch >= '0' && ch <= '9') {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}