class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        Map<Character, Integer> map = new HashMap<>();
        Map<Integer, Character> reverseAlpha = new HashMap<>();
        char ch = 'a';
        for (int i = 0; i < weights.length; i++) 
            map.put(ch++, weights[i]);
        

        char alpha = 'z';
        for (int i = 0; i <= 25; i++) 
            reverseAlpha.put(i, alpha--);
        
        List<Integer> list = new ArrayList<>();
         for (String word : words) {
            int sum = 0;
            for (int index = 0; index < word.length(); index++) {
                sum = (sum + map.get(word.charAt(index))) % 26;
            }
            list.add(sum);
        }

        StringBuilder result = new StringBuilder();
        for (int value : list) 
            result.append(reverseAlpha.get(value));
        

        return result.toString();
    }
}