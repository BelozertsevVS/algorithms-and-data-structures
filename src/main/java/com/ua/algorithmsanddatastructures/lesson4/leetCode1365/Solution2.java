package com.ua.algorithmsanddatastructures.lesson4.leetCode1365;

public class Solution2 {
    public int[] smallerNumbersThanCurrent2(int[] nums) {

        int[] counter = new int[101];

        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }
        for (int i = 1; i < 101; i++) {
            counter[i] += counter[i - 1];
        }

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                answer[i] = 0;
            } else {
                answer[i] = counter[nums[i] - 1];
            }
        }

        return answer;

    }
}
