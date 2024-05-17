function checkPalidrome(inputString) {
    return inputString === inputString.split('').reverse().join('');
}

const testCases = [
    'aabaa',
    'abac',
    'a',
    'az',
    'abacaba',
    'z',
    'aaabaaaa',
    'zzzazzazz',
    'hlbeeykoqqqqokyeeblh',
    'hlbeeykoqqqokyeeblh'
];

testCases.forEach((input) => {
    const output = checkPalidrome(input);
    console.log(`Input: ${input},`.padEnd(30, ' ') + `Output: ${output}`);
});
