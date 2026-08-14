class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (st.isEmpty() || st.peek() == ch)
                st.push(ch);
            else
                st.pop();

            if (st.isEmpty())
                count++;

        }
        return count;

    }
}