# 02 - centuryFromYear
The Journey Begins - 💻 Codewriting - 🎟️ 300

## Description
Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.

**Example:**

- For `year = 1905`, the output should be
`solution(year) = 20`;
- For `year = 1700`, the output should be
`solution(year) = 17`.

## Input/Output

**[execution time limit] 3 seconds**
**[memory limit] 1 GB**
- **[input] integer year**

> A positive integer, designating the year.
>
> _Guaranteed constraints:_
> `1 ≤ year ≤ 2005`.

- **[output] integer**

> The number of the century the year is in.

## 🎯Tests
| #      | Passed ✅ | Input      | Return Value |
|--------|----------|------------|--------------|
| Test 1 | [x]      | year: 1905 | 20           |
| Test 2 | [x]      | year: 1700 | 17           |
| Test 3 | [x]      | year: 1988 | 20           |
| Test 4 | [x]      | year: 2000 | 20           |
| Test 5 | [x]      | year: 2001 | 21           |
| Test 6 | [x]      | year: 200  | 2            |
| Test 7 | [x]      | year: 374  | 4            |
| Test 8 | [x]      | year: 45   | 1            |
| Test 9 | [x]      | year: 8    | 1            |
