#include<iostream>
using namespace std;
void Bubble_Sort(int* arr,int len) {

    for (int i = len - 1; i > 0;i--) {
        for (int j = 0; j <= i-1; j++) {
            if (arr[j] > arr[j+1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
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
    for (int i = 0; i < len; i++) {
        cin >> array[i];
    }

    Bubble_Sort(array,len);
    Print_Array(array,len);

    return 0;
}
