class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        char[]arr=word.toCharArray();
        int start=0;
        int end=index;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return new String(arr);

    }
     
}