class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        Map<Character, Integer> map = new HashMap<>();
        char ch = 'a';
        for (int i = 0; i < weights.length; i++) {
            map.put(ch++, weights[i]);
        }

        Map<Integer, Character> reverseAlpha = new HashMap<>();
        char alpha = 'z';
        for (int i = 0; i <= 25; i++) {
            reverseAlpha.put(i, alpha--);
        }
        List<Integer> list = new ArrayList<>();
        //System.out.println(reverseAlpha);
        for (String word : words) {
            int index = 0;
            int sum = 0;
            int resultModulo = 0;
            while (index < word.length()) {
                char c = word.charAt(index);
                int value = map.get(c);
                sum = sum + value;
                index++;
            }
            resultModulo = sum % 26;
            list.add(resultModulo);
        }

        StringBuilder result = new StringBuilder();
        for (int value : list) {
            result.append(reverseAlpha.get(value));
        }

        return result.toString();
    }
}