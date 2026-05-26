class Solution {
    public String addStrings(String num1, String num2) {


        StringBuilder result = new StringBuilder();

        int carry = 0;

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0) {

            int num1Digit = i >= 0 ? num1.charAt(i) - '0' : 0;
            int num2Digit = j >= 0 ? num2.charAt(j) - '0' : 0;

            int currSum = carry + num1Digit + num2Digit;

            int nextDigit = currSum >= 10 ? currSum % 10 : currSum;
            carry = currSum / 10;

            result.insert(0, String.valueOf(nextDigit));

            i--;
            j--;
        }

        if (carry == 1) {
            result.insert(0, "1");
        }

        return result.toString();
        
    }
}