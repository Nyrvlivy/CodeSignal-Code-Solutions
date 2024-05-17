def century_from_year(year):
    return 1 + (year - 1) // 100


def test():
    test_cases = [1905, 1700, 1988, 2000, 2001, 200, 374, 45, 8]

    for test_case in test_cases:
        input_str = f"Input: {test_case}"
        print(input_str.ljust(15) + "Output:", century_from_year(test_case))


def main():
    test()


if __name__ == "__main__":
    main()
