def add(param1, param2):
    return param1 + param2


def test():
    test_cases = [
        (1, 2),
        (0, 1000),
        (2, -39),
        (99, 100),
        (-100, 100),
        (-1000, -1000)
    ]

    for test_case in test_cases:
        a, b = test_case
        input_str = f"Input: {a} {b}"
        print(input_str.ljust(25) + "Output:", add(a, b))


def main():
    test()


if __name__ == "__main__":
    main()
