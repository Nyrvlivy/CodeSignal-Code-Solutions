function add(param1, param2) {
    return param1 + param2;
}

const testCases = [
    [1, 2],
    [0, 1000],
    [2, -39],
    [99, 100],
    [-100, 100],
    [-1000, -1000]
];

testCases.forEach(([param1, param2]) => {
    const output = add(param1, param2);
    console.log(`Input: (${param1}, ${param2}),`.padEnd(25, ' ') + ` Output: ${output}`);
});
