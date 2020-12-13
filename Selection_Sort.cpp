#include<iostream>
using namespace std;

void Selection_Sort(int* arr,int len) {
    for (int i = 0 ;i < len;i++) {
        for (int j = i+1; j < len;j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
       }
    }
}

void Print_Array(int* arr,int len) {
    for (int i = 0; i < len;i++) {
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

    Selection_Sort(array, len);
    Print_Array(array, len);
    
	return 0;
}