class Solution {
    public String replaceDigits(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
                //System.out.print(ch);
            } else { //2
                //char prev = ;
                //char curr = str.charAt(i); //1

                int ascii = (int) str.charAt(i - 1);
                int nextAscii = Character.getNumericValue(ch);
                int finalValue = ascii + nextAscii;
                //System.out.print((char)finalValue);
                sb.append((char) finalValue);
                //char toAdd = (char) ascii + curr; //97+1 //b
                //sb.append(toAdd);
            }
        }

        //System.out.println(sb.toString());
        return sb.toString();
    }
}