class Solution {
    public int secondHighest(String s) {
        char[] arr = s.toCharArray();
        int secondLargest = -1, largest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                if (arr[i] - '0' > largest) {
                    secondLargest = largest;
                    largest = arr[i] - '0';
                } else if (arr[i] - '0' > secondLargest && arr[i] - '0' < largest) {
                    secondLargest = arr[i] - '0';
                }
            }
        }

        return secondLargest;
    }
}