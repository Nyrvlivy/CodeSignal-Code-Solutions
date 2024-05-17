function centuryFromYear(year) {
    return 1 + Math.floor((year - 1) / 100);
}

const testCases = [1905, 1700, 1988, 2000, 2001, 200, 374, 45, 8];

testCases.forEach((input) => {
    const output = centuryFromYear(input);
    console.log(`Input: ${input},`.padEnd(15, ' ') + `Output: ${output}`);
});
