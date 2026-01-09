class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'B') {
                if (!st.isEmpty() && st.peek() == 'A') {
                    st.pop();
                }else{
                    st.push(ch);
                }
            } else if (ch == 'D') {
                if (!st.isEmpty() && st.peek() == 'C') {
                    st.pop();
                }else{
                    st.push(ch);
                }
            } else {
                st.push(ch);
            }
        }
        
        return st.size();
    }
}