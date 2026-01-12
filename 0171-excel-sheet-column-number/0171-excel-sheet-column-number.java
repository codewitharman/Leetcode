class Solution {
    public int titleToNumber(String columnTitle) { //AB
        int result = 0;

        for (char ch : columnTitle.toCharArray()) { //A //B 66
            int value = ch - 'A' + 1;   //A-A+1 65-65+1  //66-65+1  //2
            result = result * 26 + value;  //0*26+1 //1   1*26+2 //28
        }

        return result; //28
    }
}