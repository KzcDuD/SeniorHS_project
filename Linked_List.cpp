#include<iostream>
#include<iomanip>
#include<stdio.h>
using namespace std;

class LInkedList;
class ListNode {
private:
	int data;
	ListNode* next;
public:
	ListNode() :data(0), next(0) {};
	ListNode(int a) :data(a), next(0) {};
	friend class LinkedList;
};
class LinkedList {
private:
	ListNode* first;
public:
	LinkedList() :first(0) {};
	void PrintList();
	void Push_front(int x);
	void Push_back(int x);
	void Delete(int x);
	void clear();
	void Reverse();
};
void LinkedList::PrintList() {
	if (first == 0) {                     // 如果first node指向NULL, 表示list沒有資料
		cout << "List is empty.\n";
		return;
	}

	ListNode* current = first;             // 用pointer *current在list中移動
	while (current != 0) {                 // Traversal 尋訪
		cout << current->data << " ";
		current = current->next;
	}
	cout << endl;
}
void LinkedList::Push_front(int x) {

	ListNode* newNode = new ListNode(x);   // 配置新的記憶體
	newNode->next = first;                 // 先把first接在newNode後面
	first = newNode;                       // 再把first指向newNode所指向的記憶體位置

}
void LinkedList::Push_back(int x)/*在Linked list的尾巴新增資料。*/ {

	ListNode* newNode = new ListNode(x);   // 配置新的記憶體

	if (first == 0) {                      // 若list沒有node, 令newNode為first
		first = newNode;
		return;
	}

	ListNode* current = first;
	while (current->next != 0) {           
		current = current->next;
	}
	current->next = newNode;               // 將newNode接在list的尾巴
}
void LinkedList::Delete(int x) {

	ListNode* current = first,
		* previous = 0;
	while (current != 0 && current->data != x) {  // Traversal
		previous = current;                       // 如果current指向NULL
		current = current->next;                  // 或是current->data == x
	}                                             // 即結束while loop

	if (current == 0) {                 // list沒有要刪的node, 或是list為empty
		cout << "There is no " << x << " in list.\n";
		// return;
	}
	else if (current == first) {        // 要刪除的node剛好在list的開頭
		first = current->next;          // 把first移到下一個node
		delete current;                 // 如果list只有一個node, 那麼first就會指向NULL
		current = 0;                    // 當指標被delete後, 將其指向NULL, 可以避免不必要bug
		// return;                     
	}
	else {                              // 其餘情況, list中有欲刪除的node, 
		previous->next = current->next; // 而且node不為first, 此時previous不為NULL
		delete current;
		current = 0;
		// return;
	}
}
void LinkedList::clear() {

	while (first != 0) {            // Traversal
		ListNode* current = first;
		first = first->next;
		delete current;
		current = 0;
	}
}
void LinkedList::Reverse() {

	if (first == 0 || first->next == 0) {
		// list is empty or list has only one node
		return;
	}

	ListNode* previous = 0,
		* current = first,
		* preceding = first->next;

	while (preceding != 0) {
		current->next = previous;      // 把current->next轉向
		previous = current;            // previous往後挪
		current = preceding;           // current往後挪
		preceding = preceding->next;   // preceding往後挪
	}                                  // preceding更新成NULL即跳出while loop

	current->next = previous;          // 此時current位於最後一個node, 將current->next轉向
	first = current;                   // 更新first為current
}

int main() {
	LinkedList list;     // 建立LinkedList的object
	list.PrintList();    // 目前list是空的
	list.Delete(4);      // list是空的, 沒有4
	list.Push_back(5);   // list: 5
	list.Push_back(3);   // list: 5 3
	list.Push_front(9);  // list: 9 5 3
	list.PrintList();    // 印出:  9 5 3
	list.Push_back(4);   // list: 9 5 3 4
	list.Delete(9);      // list: 5 3 4
	list.PrintList();    // 印出:  5 3 4
	list.Push_front(8);  // list: 8 5 3 4
	list.PrintList();    // 印出:  8 5 3 4
	list.Reverse();      // list: 4 3 5 8
	list.PrintList();    // 印出:  4 3 5 8
	list.clear(); // list        // 清空list
	list.PrintList();    // 印出: List is empty.

	return 0;
}

