#include <iostream>
#include <string>

using namespace std;

bool checkPalindrome(string inputString) {
    return inputString == string(inputString.rbegin(), inputString.rend());
}

int main() {
    string input;
    cin >> input;
    cout << boolalpha << checkPalindrome(input) << endl;
    return 0;
}
