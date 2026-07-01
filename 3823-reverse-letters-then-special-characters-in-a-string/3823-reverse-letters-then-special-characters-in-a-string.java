class Solution {
    public String reverseByType(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[i] = ch;
            } else {
                arr[i] = '\u0000';   
            }
        }

        String str = s.replaceAll("[a-z]", "");
        int index = str.length() - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '\u0000') {
                arr[i] = str.charAt(index);
                index--;
            }
        }

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (!(arr[start] >= 'a' && arr[start] <= 'z')) {
                start++;                      
            } else if (!(arr[end] >= 'a' && arr[end] <= 'z')) {
                end--;                        
            } else {
                char temp = arr[start];        
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return String.valueOf(arr);
    }
}