package day7;

public class queen {
    static int n = 4;
    static int[] board = new int[n];

    static boolean isSafe(int row, int col) {
        // Check previously placed queens in rows 0 to row-1
        for (int i = 0; i < row; i++) {
            // Check if same column
            if (board[i] == col) {
                return false;
            }
            // Check if same diagonal
            if (Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    static boolean solve(int row) {
        // Base case: If all queens are placed successfully
        if (row == n) {
            return true;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                board[row] = col; // Place queen
                
                if (solve(row + 1)) {
                    return true;
                }
                // Backtrack happens naturally if the next rows return false
            }
        }
        return false; // Return false if queen cannot be placed in any column of this row
    }

    public static void main(String[] args) {
        if (solve(0)) {
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (board[row] == col) {
                        System.out.print("Q ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println(); // Move to next line after printing a row
            }
        } else {
            System.out.println("No solution exists.");
        }
    }

}
