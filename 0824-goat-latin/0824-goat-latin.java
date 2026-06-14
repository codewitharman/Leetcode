class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        String res = "", aEnding = "a";
        String[] words = sentence.split("\\s+");
        for(int i = 0; i < words.length; i++){
            if(set.contains(words[i].charAt(0)))
            {
                words[i] += "ma";
            }else {
                words[i] = words[i].substring(1) + words[i].charAt(0) + "ma";
            }

            words[i] += aEnding;
            aEnding += 'a';
        }

        for (String word : words)
        {
            res += word +" ";
        }

        return res.substring(0, res.length() - 1);
    }
}