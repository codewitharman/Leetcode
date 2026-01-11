class Solution {
    public int lengthOfLastWord(String s) {
        Stack<Character> stack = new Stack<>();
        String str1=s.trim();
        String str2=s.strip();

        for (char c : str2.toCharArray()) {
            if (c != ' ') stack.push(c);
            else if (!stack.isEmpty()) stack.clear();
        }

        return stack.size();
    }
}
