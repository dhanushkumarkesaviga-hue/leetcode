class Solution {
    public int totalNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char [n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n ;j ++){
                board[i][j] = '.';
            }
        }
        solve(0,ans,board);
        return ans.size();
        
    }
    private void solve (int col, List<List<String>> ans , char[][] board){
        if(col == board.length){
            List<String> l = new ArrayList<>();
            for(int i =0; i<board.length;i++){
                l.add(new String (board[i]));
            }
            ans.add(l);
            return;
        }
        for(int i=0; i<board.length; i++){
            if(canPlace(i,col,board) == true){
                board[i][col] = 'Q';
                solve(col +1, ans, board);
                board[i][col] = '.';
            }
        }
    }
    private boolean canPlace (int row, int col, char[][] board){
        //check for row
        int i = row;
        int j = col;
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col--;
        }

        //check for upper diagonal
        row = i;
        col = j;
        while (row>= 0 && col>=0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        //check for lower diagonal
        row = i;
        col = j;
        while(row<= board.length - 1 && col>=0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }

        return true;
    }}