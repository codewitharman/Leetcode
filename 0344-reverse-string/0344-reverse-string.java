class Solution {
    public void reverseString(char[] s) {
        String res=new String(s);
        StringBuilder sb=new StringBuilder(res);
        sb.reverse();
        String temp=sb.toString();
        for(int i=0;i<s.length;i++)
        {
            s[i]=temp.charAt(i);
        }
    }
}