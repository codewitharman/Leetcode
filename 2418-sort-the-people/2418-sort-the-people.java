import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, List<String>> map = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            map.computeIfAbsent(heights[i], k -> new ArrayList<>()).add(names[i]);
        }

        String[] result = new String[names.length];
        int index = 0;
        for (List<String> group : map.descendingMap().values()) {
            for (String name : group) {
                result[index++] = name;
            }
        }

        return result;
    }
}