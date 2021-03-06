package ru.job4j;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int line = 0; line < board.length; line++) {
            if (board[row][line] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int line = 0; line < board.length; line++) {
            if (board[line][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int line = 0; line < board.length; line++) {
            rsl[line] = board[line][line];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X' && (monoHorizontal(board, index) || monoVertical(board, index))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
