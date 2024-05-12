package com.codesignal.c01_intro;

public class E03CheckPalindromeV2 {

    public static boolean checkPalindrome(String inputString) {
        // return inputString.equals(new StringBuilder(inputString).reverse().toString());
        return inputString.contentEquals(new StringBuilder(inputString).reverse());
    }

    public static void main(String[] args) {
        String[] testCases = {
            "aabaa",
            "abac",
            "a",
            "az",
            "abacaba",
            "z",
            "aaabaaaa",
            "zzzazzazz",
            "hlbeeykoqqqqokyeeblh",
            "hlbeeykoqqqokyeeblh"
        };

        for (String testCase : testCases) {
            boolean result = checkPalindrome(testCase);
            System.out.printf("Input: %-20s Output: %s%n", testCase, result);
        }

    }
}
