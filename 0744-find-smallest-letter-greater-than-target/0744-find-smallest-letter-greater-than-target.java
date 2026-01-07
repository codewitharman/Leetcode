class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters.length==0) return ' ';
        if(target=='z') return letters[0];
        if(letters[letters.length-1]==target) return letters[0];

       for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];

    }
}