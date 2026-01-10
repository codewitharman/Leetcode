class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char [] arr= s.toLowerCase().toCharArray();
        for(char ch : arr)
        {
            if(Character.isLetterOrDigit(ch))
                sb.append(ch);
        }
        int start = 0;
        int end = sb.length() - 1;
        while(end>start)
        {
            if(sb.charAt(start)!=sb.charAt(end))
            {
                return false;
            }
            start ++;
            end--;
        }
        return true;
    }
}