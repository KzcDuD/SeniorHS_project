#include<iostream>
using namespace std;

void Selection_Sort(int* arr,int len) {
    for (int i=len;i>=0;i--){
        int max_idx=i;
        for(int j=i;j>=0;j--){
            if(arr[j]>arr[max_idx]){
                max_idx=j;
            }
        }
        int tmp = arr[i];
        arr[i]=arr[max_idx];
        arr[max_idx] = tmp;
        print(arr,len);
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
