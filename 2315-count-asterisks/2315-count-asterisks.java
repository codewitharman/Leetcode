class Solution {
    public int countAsterisks(String s) {
        String[] arr = s.split("\\|");
        int count = 0;

        for (int i = 0; i < arr.length; i += 2) {   
            //System.out.println(arr[i]);
            for (char ch : arr[i].toCharArray()) {
                if (ch == '*') {
                    count++;
                }
            }
        }

        return count;
    }
}