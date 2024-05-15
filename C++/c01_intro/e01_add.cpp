#include <iostream>

using namespace std;

int add(int param1, int param2) {
    return param1 + param2;
}

int main() {
    int param1, param2;
    cin >> param1 >> param2;
    cout << add(param1, param2) << endl;
    return 0;
}
