#include<iostream>
#include<iomanip>
#include<stdio.h>
using namespace std;

class Hanoi {
public:
	void HanoiTower(int, char, char, char);
};
void Hanoi::HanoiTower(int n, char a, char b, char c) {
	if (n == 1){
		cout << " 1 " << a << " -> " << c << "\n";
	}else {
		HanoiTower(n - 1, a, c, b);
		cout <<" "<< n <<" "<< a << " -> " << c <<"\n";
		HanoiTower(n - 1, b, a, c);
	}
}
int main() {
	Hanoi obj;
	int n;

	char A = 'A';
	char B = 'B';
	char C = 'C';
	cout << "How many disk in A? ";
	cin >> n;
	if (n == 0)
		cout << "no disk";
	else
		obj.HanoiTower(n, A, B, C);
	system("PAUSE");

	return 0;
}
