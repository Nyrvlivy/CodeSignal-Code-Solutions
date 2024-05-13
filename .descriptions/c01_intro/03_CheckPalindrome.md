# 02 - centuryFromYear
The Journey Begins - 💻 Codewriting - 🎟️ 300

## Description
Given the string, check if it is a palindrome.

> Palindrome
>
> A string that doesn't change when reversed (it reads the same backward and forward).
>
> Examples:
> - `"eye"` is a palindrome
> - `"noon"` is a palindrome
> - `"decaf faced"` is a palindrome
> - `"taco cat"` is **not** a palindrome (backwards it spells `"tac ocat"`)
> - `"racecars"` is **not** a palindrome (backwards it spells `"sracecar"`)

**Example:**

- For `inputString = "aabaa"`, the output should be
`solution(inputString) = true`;
- For `inputString = "abac"`, the output should be
`solution(inputString) = false`;
- For `inputString = "a"`, the output should be
`solution(inputString) = true`.

## Input/Output

**[execution time limit] 3 seconds**
**[memory limit] 1 GB**
- **[input] integer  inputString**

> A non-empty string consisting of lowercase characters.
>
> _Guaranteed constraints:_
> `1 ≤ inputString.length ≤ 105`.

- **[output] boolean**

> `true` if `inputString` is a palindrome, `false` otherwise.

## 🎯Tests
| #       | Passed ✅ | Input                               | Return Value |
|---------|----------|-------------------------------------|--------------|
| Test 1  | [x]      | inputString: "aabaa"                | true         |
| Test 2  | [x]      | inputString: "abac"                 | false        |
| Test 3  | [x]      | inputString: "a"                    | true         |
| Test 4  | [x]      | inputString: "az"                   | false        |
| Test 5  | [x]      | inputString: "abacaba"              | true         |
| Test 6  | [x]      | inputString: "z"                    | true         |
| Test 7  | [x]      | inputString: "aaabaaaa"             | false        |
| Test 8  | [x]      | inputString: "zzzazzazz"            | false        |
| Test 9  | [x]      | inputString: "hlbeeykoqqqqokyeeblh" | true         |
| Test 10 | [x]      | inputString: "hlbeeykoqqqokyeeblh"  | true         |
