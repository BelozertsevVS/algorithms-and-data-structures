package com.ua.algorithmsanddatastructures.lesson4.leetCode1365;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        1365. How Many Numbers Are Smaller Than the Current Number
        https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

        Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
        That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

        Return the answer in an array.

        Constraints:
        2 <= nums.length <= 500
        0 <= nums[i] <= 100
        */

        int[] nums = {8, 1, 2, 2, 3};

        Solution1 answer1 = new Solution1();
        int[] result1 = answer1.smallerNumbersThanCurrent1(nums);
        System.out.println(Arrays.toString(result1));

        Solution2 answer2 = new Solution2();
        int[] result2 = answer2.smallerNumbersThanCurrent2(nums);
        System.out.println(Arrays.toString(result2));

    }
}
