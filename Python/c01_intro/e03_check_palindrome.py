def check_palindrome(input_string):
    return input_string == input_string[::-1]


def test():
    test_cases = [
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
    ]

    for test_case in test_cases:
        input_str = f"Input: {test_case}"
        print(input_str.ljust(30) + "Output:", check_palindrome(test_case))


def main():
    test()


if __name__ == "__main__":
    main()
