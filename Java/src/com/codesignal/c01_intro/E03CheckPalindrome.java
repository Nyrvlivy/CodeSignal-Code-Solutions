package com.codesignal.c01_intro;

public class E03CheckPalindrome {

    public static boolean checkPalindrome(String inputString) {
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)) return false;
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
