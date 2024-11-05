package com.ua.algorithmsanddatastructures.lesson4.leetCode999;

public class Solution {

    public int numRookCaptures(char[][] board) {

        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'R') {
                    return countPawnsOnTheWay(board, n, i, j, -1, 0)
                            + countPawnsOnTheWay(board, n, i, j, 0, 1)
                            + countPawnsOnTheWay(board, n, i, j, 1, 0)
                            + countPawnsOnTheWay(board, n, i, j, 0, -1);


                }
            }
        }


        return 0;
    }

    private int countPawnsOnTheWay(char[][] board, int n, int x, int y, int dx, int dy) {

        boolean isValidCell = true;

        while (isValidCell == true) {
            if (board[x][y] == 'p') {
                return 1;
            } else if (board[x][y] == 'B') {
                return 0;
            }
            x += dx;
            y += dy;

            isValidCell = isCanMove(n, x, y);

        }
        return 0;
    }

    private static boolean isCanMove(int n, int x, int y) {
        return x > -1 && x < n && y > -1 && y < n;
    }


}
