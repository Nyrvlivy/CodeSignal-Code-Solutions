package com.codesignal.c01_intro;

import java.util.Scanner;

public class E01Add {

    public static int addNumbers(int param1, int param2) {
        return param1 + param2;
    }

    public static void main(String[] args) {

        int[][] testCases = {
            {1, 2},
            {0, 1000},
            {2, -39},
            {99, 100},
            {-100, 100},
            {-1000, -1000}
        };

        for (int[] testCase : testCases) {
            int result = addNumbers(testCase[0], testCase[1]);
            System.out.printf("Input: %d %d Output: %d%n", testCase[0], testCase[1], result);
        }

    }
}
