package com.ua.algorithmsanddatastructures.lesson4.leetCode1365;

public class Solution1 {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] answer = new int[nums.length];
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    counter++;
                }
            }
            answer[i] = counter;
            counter = 0;
        }
        return answer;
    }
}
