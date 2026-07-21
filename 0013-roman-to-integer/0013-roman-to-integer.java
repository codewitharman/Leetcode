class Solution {
    public int romanToInt(String s) {
        int values[] = new int[128];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;
        int res = values[s.charAt(s.length() - 1)];
        for (int i = s.length() - 2; i >= 0; i--) {
            if (values[s.charAt(i)] < values[s.charAt(i + 1)]) {
                res = res - values[s.charAt(i)];
            } else {
                res = res + values[s.charAt(i)];
            }

        }
        return res;

    }
}