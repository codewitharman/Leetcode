class Solution {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        for(int i=0;i<word.length();i++){
            if(ch==word.charAt(i)){
                index=i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(word.substring(0,index+ 1)).reverse();
        sb.append(word.substring(index+1, word.length()));

        return sb.toString();

    }
}