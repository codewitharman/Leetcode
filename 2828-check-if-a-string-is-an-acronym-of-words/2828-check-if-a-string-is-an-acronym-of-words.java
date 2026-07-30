class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()) return false;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.size();i++){
            String word=words.get(i);
            for(int j=0;j<word.length();j++){
                sb=sb.append(word.charAt(0));
                break;
            }
            //System.out.println(word);
        }
            //System.out.println(sb);


        return s.equals(sb.toString());
    }
}