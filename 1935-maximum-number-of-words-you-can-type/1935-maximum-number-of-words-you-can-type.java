class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        char[] chars = brokenLetters.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            boolean canType = true;          
            int start = 0;
            int end = chars.length;
            while (start < end) {
                char ch = chars[start];
                if (word.indexOf(ch) >= 0) { 
                    canType = false;
                    break;                   
                }
                start++;
            }
            if (canType) {
                count++;                     
            }
        }
        return count;
    }
}