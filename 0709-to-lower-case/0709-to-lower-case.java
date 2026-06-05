class Solution {
    public String toLowerCase(String s) {
        return s.chars()
                .map(Character::toLowerCase)
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());
    }
}