class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] grid = new boolean[9][9];

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                if(board[r][c] == '.') continue;

                int num = board[r][c] - '1'; //convert 1-9 to 0-8
                int gridIndex = (r / 3) * 3 + (c / 3);

                if(row[r][num] || col[c][num] | grid[gridIndex][num]) {
                    return false;
                }

                row[r][num] = col[c][num] = grid[gridIndex][num] = true;
            }
        }
        return true;
    }
}