package com.ua.algorithmsanddatastructures.lesson4.leetCode442;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> answer = new ArrayList<>();

        // index   0. 1. 2. 3. 4. 5. 6. 7
        // nums = [4, 3, 2, 7, 8, 2, 3, 1]

        for (int i = 0; i < nums.length; i++) {

            int idx = Math.abs(nums[i]) - 1;

            if (nums[idx] < 0) {
                answer.add(Math.abs(idx + 1));
            }
            nums[idx] = -nums[idx];
        }

        return answer;
    }

}
