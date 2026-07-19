class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target == 'z')
            return letters[0];

        for (int i = 0; i < letters.length - 1; i++) {
            char ch = letters[i]; //c
            char next = letters[i + 1];
            if (target < ch && target < next) {
                return ch;
            }
            if (target >= ch && target < next) { //c>=c true && c<=f
                return next;
            }
        }

        return letters[0];
    }
}