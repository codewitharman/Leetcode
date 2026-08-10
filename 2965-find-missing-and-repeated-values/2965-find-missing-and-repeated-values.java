class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int res[] = new int[2];

        int n = grid.length;
        int cal = n*n;
        int expSum = (cal * (cal+1)) / 2;
        int[] freq = new int[n*n+1];
        int currSum = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int val = grid[i][j];
                if(freq[val] == 0) {
                    freq[val] += 1;
                    currSum += val;
                }
                else {
                    res[0] = val;
                }
            }    
        }

        res[1] = expSum - currSum;

        return res;
    }
}