class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if ((arr[start] >= 'a' && arr[start] <= 'z') ||
                    (arr[start] >= 'A' && arr[start] <= 'Z')) {

                if ((arr[end] >= 'a' && arr[end] <= 'z') ||
                        (arr[end] >= 'A' && arr[end] <= 'Z')) {

                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }

        return new String(arr);
    }
}
