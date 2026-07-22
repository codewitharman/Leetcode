class Solution {
    public int reverseDegree(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char alpha = 'a';
        for (int i = 26; i >= 1; i--)
            map.put(alpha++, i);

        int index = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) 
            if (map.containsKey(s.charAt(i)))
                sum = sum + (map.get(s.charAt(i)) * ++index);


        return sum;

    }
}