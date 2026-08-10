class Solution {
    public int numberOfMatches(int n) {
        int temp = n, result = 0;
        while (temp > 1) {
            int team1 = temp / 2;
            int team2 = temp - team1;
            int max = Math.max(team1, team2);
            int min = Math.min(team1, team2);
            result = result + min;
            temp = max;
        }

        return result;
    }
}