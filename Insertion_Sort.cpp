#include <iostream>
using namespace std;

void Insertion_Sort(int* arr, int len) {

    for (int i = 1; i < len; i++) {
        int key = arr[i];
        int j = i - 1;

        while (key < arr[j] && j >= 0) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

}
void Print_Array(int* arr, int len) {
    for (int i = 0; i < len; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}
int main() {
    int len;
    cin >> len;
    int* array = new int[len];
    for (int i = 0; i < len;i++) {
        cin >> array[i];
    }
    Insertion_Sort(array, len);
    Print_Array(array, len);
    
    return 0;
}