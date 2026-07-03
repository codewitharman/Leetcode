class Solution {
    public String replaceDigits(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
                System.out.print(ch);
            } else { //2
                char prev = str.charAt(i - 1);
                char curr = str.charAt(i); //1

                int ascii = (int) prev;
                int nextAscii = Character.getNumericValue(curr);
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