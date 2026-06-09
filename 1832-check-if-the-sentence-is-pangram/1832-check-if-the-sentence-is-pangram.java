class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
        }
        boolean flag = false;
        if (set.size() == 26) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}