class Solution {
    int count = 0;

    public int islandPerimeter(int[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, visited, i, j);
                    break;
                }
            }
        }
        return count;
    }

    public void dfs(int[][] grid, boolean visited[][], int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            count++;
            return;
        }
        if (visited[row][col]) {
            return;
        }
        if (grid[row][col] == 0) {
            count++;
            return;
        }

        visited[row][col] = true;
        dfs(grid, visited, row + 1, col);
        dfs(grid, visited, row - 1, col);
        dfs(grid, visited, row, col + 1);
        dfs(grid, visited, row , col - 1);

    }
}