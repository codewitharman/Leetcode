class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : moves.toCharArray()) {
            //if (ch != '_')
                map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int r = 0;
        int l = 0;
        int x = 0;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getKey() == 'L') {
                l = e.getValue();
            } else if (e.getKey() == 'R') {
                r = e.getValue();
            } else {
                x = e.getValue();
            }
        }

        int result=Math.abs(l-r)+x;

        return result;

    }
}