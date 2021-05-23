package pl.glownia.pamela;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initBoard();
        int emptyCells = 9;
        displayBoard();
        char userX = 'X';
        char userO = 'O';
        while (emptyCells >= 0) {
            xTurn();
            emptyCells -= 1;
            if (checkWin(userX)) {
                System.out.println(userX + " WIN!");
                break;
            }
            if (emptyCells == 0) {
                System.out.println("This game is a tie.");
                break;
            }
            oTurn();
            emptyCells -= 1;
            if (checkWin(userO)) {
                System.out.println(userO + " WIN!");
                break;
            }
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("    ---+---+---");
        System.out.println("  1  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("    ---+---+---");
        System.out.println("  2  " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println("     0   1   2 ");
    }

    public static void xTurn() {
        Scanner scan = new Scanner(System.in);
        System.out.print("'X', choose your location(row, column): ");
        int i = scan.nextInt();
        int j = scan.nextInt();
        while (!isEmpty(i, j)) {
            i = scan.nextInt();
            j = scan.nextInt();
        }
        board[i][j] = 'X';
        displayBoard();
    }

    public static void oTurn() {
        Scanner scan = new Scanner(System.in);
        System.out.print("'O', choose your location(row, column): ");
        int i = scan.nextInt();
        int j = scan.nextInt();
        while (!isEmpty(i, j)) {
            i = scan.nextInt();
            j = scan.nextInt();
        }
        board[i][j] = 'O';
        displayBoard();
    }

    public static boolean isEmpty(int i, int j) {
        if (board[i][j] != ' ') {
            System.out.print("This cell is not empty. Try again:");
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean checkWin(char user) {
        if (board[0][0] == user && board[1][0] == user && board[2][0] == user) {
            return true;
        }
        else if (board[0][0] == user && board[0][1] == user && board[0][2] == user) {
            return true;
        }
        else if (board[0][0] == user && board[1][1] == user && board[2][2] == user) {
            return true;
        }
        else if (board[0][1] == user && board[1][1] == user && board[2][1] == user) {
            return true;
        }
        else if (board[0][2] == user && board[1][2] == user && board[2][2] == user) {
            return true;
        }
        else if (board[1][0] == user && board[1][1] == user && board[1][2] == user) {
            return true;
        }
        else if (board[2][0] == user && board[2][1] == user && board[2][2] == user) {
            return true;
        }
        else if (board[0][2] == user && board[1][2] == user && board[2][0] == user) {
            return true;
        }
        else {
            return false;
        }
    }
}