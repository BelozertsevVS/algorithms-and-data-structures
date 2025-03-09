package com.ua.algorithmsanddatastructures.lesson4.leetCode442;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @DisplayName("Find All Duplicates in an Array")
    @CsvFileSource(resources = "/test-data442.csv", delimiter = ';', numLinesToSkip = 0)
    void findDuplicates(String input, String output) {

        int[] nums = paseArray(input);
        List<Integer> expectedArray = paseList(output);
        List<Integer> result = solution.findDuplicates(nums);

        assertEquals(expectedArray, result);

    }

    private int[] paseArray(String str) {
        return Stream.of(str.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }


    private List<Integer> paseList(String str) {
        if(str == null || str.trim().isEmpty()) {
            return List.of();
        }

        return Stream.of(str.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}