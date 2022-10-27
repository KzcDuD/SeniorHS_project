#include<iostream>
using namespace std;
const int maxn = 100 + 10;
int main() {
	int loop;
	cin >> loop;
	while (loop--) {
		int n, a[maxn];
		cin >> n;
		for (int i = 0; i < n;i++) {
			cin >> a[i];
		}
		bool isque = true, issta = true;
		for (int i = 0; i < n;i++) {
			int x;
			cin >> x;
			if (x!=a[i]) {
				isque = false;
			}
			if (x != a[n-i-1]) {
				issta = false;
			}
		}
		if (issta && isque) {
			cout << "both" << endl;
		}
		else if (issta) {
			cout << "stack" << endl;
		}
		else if (isque) {
			cout << "queue" << endl;
		}
		else {
			cout << "neither" << endl;
		}
	}

	return 0;
}
