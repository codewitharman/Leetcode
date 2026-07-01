class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            char ch = s.charAt(i);
            result[indices[i]] = ch;
        }
        //System.out.println(Arrays.toString(result));
        return String.valueOf(result);
    }
}