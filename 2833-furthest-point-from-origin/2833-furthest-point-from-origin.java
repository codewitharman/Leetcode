class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r = 0;
        int l = 0;
        int x = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                l = l + 1;
            } else if (ch == 'R') {
                r = r + 1;
            } else {
                x = x + 1;
            }
        }
        return Math.abs(l - r) + x;
    }
}