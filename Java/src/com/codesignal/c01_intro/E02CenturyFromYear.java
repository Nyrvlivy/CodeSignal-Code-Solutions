package com.codesignal.c01_intro;

public class E02CenturyFromYear {

    public static int centuryFromYear(int year) {
        return 1 + (year - 1) / 100;
    }

    public static void main(String[] args) {
        int[] testCases = {
            1905,
            1700,
            1988,
            2000,
            2001,
            200,
            374,
            45,
            8,
            1
        };

        for (int testCase : testCases) {
            int result = centuryFromYear(testCase);
            System.out.printf("Input: %-5d Output: %d%n", testCase, result);
        }

    }
}
