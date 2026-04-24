class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            ransomMap.put(c, ransomMap.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (char ch : ransomMap.keySet()) {
            if (magazineMap.getOrDefault(ch, 0) < ransomMap.get(ch)) {
                return false;
            }
        }

        return true;
    }
}