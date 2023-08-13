import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        //create borad for tic tac toe
        char[][] board = new char[3][3]; // 2D Array


        //creating number of rows and columns for board

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' '; // Initialize empty

            }
        }

        char player = 'X';//Intialize x for first player
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        
        while (!gameOver) {
            printBoard(board);
            System.out.println("player " + player + " enter: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();//creating rows and columns of board

            if (board[row][col] == ' ') {
                // place the element
                board[row][col] = player;
                gameOver = haveWon(board, player);//rows or columns entries player won

                if (gameOver) {
                    System.out.println("player " + player + " has won: ");
                }

                else {

                    // player = (player == 'X') ? '0' : 'X';

                    if (player == 'X') {
                        player = '0';
                    } else {
                        player = 'X';
                    }

                }
            } else {
                System.out.println("Invalis move. Try again!");
            }
        }
        printBoard(board);
    }

    public static boolean haveWon(char[][] board, char player) {
        // check the rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // check the cols
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}