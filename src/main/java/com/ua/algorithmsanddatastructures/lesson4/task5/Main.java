package com.ua.algorithmsanddatastructures.lesson4.task5;

public class Main {
    public static void main(String[] args) {

        /**
         * Вам дано список (масив) слів words, та два слова word1, word2.
         * Порахуйте найкоротшу дистанцію між цими двома словами в масиві.
         *
         * word1 і word2 не збігаються і обидва присутні в масиві.
         *
         * Приклад:
         * Input: words = ["practice", "makes", "perfect", "coding", "makes"],
         * word1 = "coding", word2 = "practice"
         * Output: 3
         */
        String[] array = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";

        int result = solve(array, word1, word2);
        System.out.println(result);





    }

    // Time  O(n)
    // Space O(1)
    public static int solve (String[] array, String word1, String word2) {

        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word1)) {
                idx1 = i;
            }
            if (array[i].equals(word2)) {
                idx2 = i;
            }
        }

        int maxIndex = Math.max(idx1, idx2);
        int minIndex = Math.min(idx1, idx2);

        return maxIndex - minIndex;
    }
}
