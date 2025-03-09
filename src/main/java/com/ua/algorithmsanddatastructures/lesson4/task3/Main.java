package com.ua.algorithmsanddatastructures.lesson4.task3;

public class Main {
    public static void main(String[] args) {
        /**
         * /**
         *  * Вам дано масив цілих чисел nums.
         *  * Поверніть мінімальну кількість операцій необхідних для того, щоб зробити nums
         *  * строго зростаючим.
         *  *
         *  * Одна операція – це збільшення будь-якого елемента в масиві на 1.
         *  *
         *  * Масив nums буде строго зростаючим якщо
         *  * nums[i] < nums[i+1] для всіх 0 <= i < nums.length - 1
         *  * Масив з одним елементом вважається строго зростаючим.
         *  *
         *  * Приклад:
         *  * Input: nums = [1,1,1]
         *  * Output: 3
         *  *
         *  * Пояснення: строго зростаючим буде масив [1,2,3], тому необхідно збільшити
         *  * nums[1] рівно 1 раз, а nums[2] 2 разу.
         */


        int[] nums = {1, 1, 1};

        int result = solve(nums);

        System.out.println(result);


    }

    // Time  O(n)
    // Space O(1)

    public static int solve(int[] nums) {

        int result = 0;

        if (nums.length == 1) {
            return result;
        }

        for (int i = 1; i < nums.length; i++) {

            if (nums[i-1] == nums[i]) {
                result = result + 1;
                nums[i] = nums[i] + 1;
            } else if (nums[i-1] > nums[i]) {

                result = result + nums[i-1] - nums[i] + 1;
                nums[i] = nums[i] + nums[i-1] - nums[i] + 1;

            }

        }

        return result;

    }


}
