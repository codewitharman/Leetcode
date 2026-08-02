class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length();
        int index=n-1;
        while(index>=0)
        {
            if(num.charAt(index)=='0')
            {
                index--;
            }
            else
            {
                break;
            }
        }
        return num.substring(0,index+1);
    }
}