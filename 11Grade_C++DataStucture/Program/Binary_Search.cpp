#include<iostream>
using namespace std;

int Binary_Sreach(int* arr, int len, int value) {
	int index=-1, center;
	int start = 0, end = len - 1;
	
	while (start<=end) {
		center = (start + end)/2;
		if (arr[center]==value) {
			index=center;
			break;
		}
		else if (arr[center] > value) {
			end = center - 1;
		}
		else {
			start = center + 1;
		}
	}

	return index;
}

void sort(int* arr,int len) {
	for (int i = 0; i < len;i++) {
		for (int j = i; j < len;j++) {
			if (arr[j]<arr[i]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
}

int main() {
	int n,find;
	cout<<"\ninput length of the array.\n";
	cin >> n;

	int* array = new int[n];
	cout<<"\ninput number in the array.\n";
	for (int i = 0; i < n;i++) {
		cin >> array[i];
	}

	sort(array,n);
	for (int i = 0; i < n;i++) {
		cout << array[i]<<"  ";
	}

	cout << "\nWhat you want to find?\n";
	cin >> find;
	int bi = Binary_Sreach(array,n,find);

	cout <<"The index of "<< find<<"is "<< bi <<"."<< endl;
	
	return 0;
}
