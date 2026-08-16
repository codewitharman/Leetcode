import java.util.*;

class Solution {
    public int percentageLetter(String s, char letter) {
        if (s.indexOf(letter) == -1) {
            return 0;
        }
        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long occurrence = map.getOrDefault(letter, 0l);

        return (int) (occurrence * 100) / s.length();

    }
}