class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters.length==0) return ' ';
        if(target=='z') return letters[0];
        if(letters[letters.length-1]==target) return letters[0];

       for (char c : letters) {
            if (c > target) {
                return c;
            }
        }
        return letters[0];

    }
}