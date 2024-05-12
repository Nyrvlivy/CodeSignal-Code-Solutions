package com.codesignal.c01_intro;

public class E03CheckPalindromeV3 {

    public static boolean checkPalindrome(String inputString) {
        for (int i = 0, j = inputString.length() - 1; i <= j; i++, j--) {
            if (inputString.charAt(i) != inputString.charAt(j)) return false;
        }
        return true;
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
