class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            int num = Integer.valueOf(str);
            sb = sb.append(Integer.toBinaryString(num)).append("-");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}