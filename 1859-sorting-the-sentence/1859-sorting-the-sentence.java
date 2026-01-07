class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Map<Integer,String> map=new HashMap<>();
        for(String word :words){
            int pos=word.charAt(word.length() - 1) - '0';  //position
            map.put(pos,word.substring(0, word.length() - 1)); //wordwithouthenumber
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= words.length; i++){ 
            sb.append(map.get(i)).append(" ");   //get the index 1 word to n and append them with spaces in it 
        }
        return sb.toString().trim();  //remove the ending/trailing white space

    }
}