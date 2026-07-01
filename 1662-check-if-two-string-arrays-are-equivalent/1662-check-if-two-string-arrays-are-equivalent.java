class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (String str : word1) {
            for (char ch : str.toCharArray()) {
                list1.add(ch);
            }
        }
        for (String str : word2) {
            for (char ch : str.toCharArray()) {
                list2.add(ch);
            }
        }

        return list1.equals(list2);
    }
}