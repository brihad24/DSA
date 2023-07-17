// Question: https://leetcode.com/problems/sudoku-solver/

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = new char[][]{
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
            };

        solve(board);
        display(board);
    }

    static void solve(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == '.'){
                    board[i][j] = '0';
                }
            }
        }
        sudoku(board);
    }

    static boolean sudoku(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == '0'){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(emptyLeft == false){
                break;
            }
        }

        if(emptyLeft == true){
            return true; // sudoku is solved
        }

        // backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = (char)(number + '0');
                if (sudoku(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = '0';
                }
            }
        }
        return false;
    }

    private static void display(char[][] board) {
        for(char[] row : board) {
            for(char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(char[][] board, int row, int col, int num){
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check if num is in row
            if((board[row][i] - '0') == num){
                return false;
            }
        }

        // check the column
        for (char[] nums : board) {
            if((nums[col] - '0') == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for(int c = colStart; c < colStart + sqrt; c++){
                if((board[r][c] - '0') == num){
                    return false;
                }
            }
        }

        return true;
    }
}
