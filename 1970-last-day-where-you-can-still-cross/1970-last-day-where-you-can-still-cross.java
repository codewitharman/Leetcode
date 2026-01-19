class Solution {
    private int[] parent;
    private int[] rank;

    public int latestDayToCross(int row, int col, int[][] cells) {
        int n = row * col;
        int top = n;
        int bottom = n + 1;

        parent = new int[n + 2];
        rank = new int[n + 2];

        for (int i = 0; i < n + 2; i++) {
            parent[i] = i;
        }

        boolean[][] land = new boolean[row][col];
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        for (int i = cells.length - 1; i >= 0; i--) {
            int r = cells[i][0] - 1;
            int c = cells[i][1] - 1;
            land[r][c] = true;

            int idx = r * col + c;

            if (r == 0)
                union(idx, top);
            if (r == row - 1)
                union(idx, bottom);

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < row && nc >= 0 && nc < col && land[nr][nc]) {
                    union(idx, nr * col + nc);
                }
            }

            if (find(top) == find(bottom)) {
                return i;
            }
        }

        return 0;
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px == py)
            return;

        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else if (rank[px] > rank[py]) {
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }
}
