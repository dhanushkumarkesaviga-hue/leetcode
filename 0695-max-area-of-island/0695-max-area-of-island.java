class Solution {
    int max = 0;
  

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] ==1 && !(visited[i][j])) {
                   int area = dfs(i, j, grid, visited);
            max= Math.max(area,max);
                }
            }
        }
        return max;
    }

    public int dfs(int row, int col, int[][] grid, boolean visited[][]) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return 0;
        }
        if (grid[row][col]==0 ||visited[row][col]) {
            return 0;
        }
       
        visited[row][col] = true;
          int sum = 1;
        sum += dfs(row + 1, col, grid, visited);
        sum += dfs(row - 1, col, grid, visited);
        sum += dfs(row, col - 1, grid, visited);
        sum += dfs(row, col + 1, grid, visited);
     
        return sum;

    }
}