package com.ua.algorithmsanddatastructures.lesson4.task4;

public class Main {
    public static void main(String[] args) {
        /**
         * Вам дана матриця MxN. Поверніть true якщо це Toeplitz матриця. Інакше
         * поверніть false.
         *
         * Toeplitz матриця -- це матриця в якій кожна діагональ
         * (з верхнього лівого елемента до нижнього правого елемента) має однакові
         * значення.
         *
         * Приклад Toeplitz матриці:
         * 1,2,3,4
         * 5,1,2,3
         * 9,5,1,2
         * Діагоналями є: "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4] ".
         */


        int[][] matrix = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}
        };

        boolean result = solve(matrix);

        System.out.println(result);

    }


   // Time  O(MxN)
   // Space O(1)
    public static boolean solve (int[][] matrix) {

        for (int i = 1; i < matrix.length ; i++) {
            for (int j = 1; j < matrix[0].length ; j++) {
                if (matrix[i][j] != matrix[i-1][j-1]) {
                    return false;
                }

            }

        }
        return true;
    }
}
