class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> vowelMap = new HashMap<>();
        Map<Character, Integer> consonantMap = new HashMap<>();
        for (char ch : s.toCharArray()) 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelMap.put(ch, vowelMap.getOrDefault(ch, 0) + 1);
            else
                consonantMap.put(ch, consonantMap.getOrDefault(ch, 0) + 1);
        

        int maxVowelValue = 0, maxConsonantValue = 0;
        for (Map.Entry<Character, Integer> e : vowelMap.entrySet())
            if (e.getValue() > maxVowelValue)
                maxVowelValue = e.getValue();

        for (Map.Entry<Character, Integer> e : consonantMap.entrySet())
            if (e.getValue() > maxConsonantValue)
                maxConsonantValue = e.getValue();

        return maxVowelValue + maxConsonantValue;
    }
}