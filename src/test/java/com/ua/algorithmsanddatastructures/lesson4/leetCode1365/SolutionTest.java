package com.ua.algorithmsanddatastructures.lesson4.leetCode1365;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private final Solution solution = new Solution();


    @ParameterizedTest
    @DisplayName("The number of numbers is less than the current one")
    @CsvFileSource(resources = "/test-data1365.csv", delimiter = ';', numLinesToSkip = 0)
    void smallerNumbersThanCurrent1(String input, String output) {
        int[] nums = parseArray(input);
        int[] expectedArray = parseArray(output);
        int[] result = solution.smallerNumbersThanCurrent1(nums);

        assertArrayEquals(expectedArray, result);

    }


    @ParameterizedTest
    @DisplayName("The number of numbers is less than the current one")
    @CsvFileSource(resources = "/test-data1365.csv", delimiter = ';', numLinesToSkip = 0)
    void smallerNumbersThanCurrent2(String input, String output) {
        int[] nums = parseArray(input);
        int[] expectedArray = parseArray(output);
        int[] result = solution.smallerNumbersThanCurrent2(nums);

        assertArrayEquals(expectedArray, result);
    }

    private int[] parseArray(String str) {
        return Stream.of(str.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}