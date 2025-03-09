package com.ua.algorithmsanddatastructures.lesson4.task2;

public class Main {
    public static void main(String[] args) {

        /**
         * Вам дана матриця MxN цілих чисел - accounts. Де accounts[i][j] зберігає
         * кількість грошей які ith клієнт має на jth рахунку.
         * Поверніть стан найбагатшого клієнта.
         *
         * Стан клієнта це сума всіх його коштів на всіх рахунках.
         *
         * Приклад:
         * Input: accounts = [[1,5],[7,3],[3,5]]
         * Output: 10
         */

        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        int result = findTheRichestClient(accounts);

        System.out.println(result);


    }

    public static int findTheRichestClient(int[][] accounts) {

        int result = 0;


        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];

            }
            if (sum > result) {
                result = sum;
            }
            
        }

        return result;
    }
}
