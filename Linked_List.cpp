#include<iostream>
using namespace std;

class LinkedList;
class ListNode{
    private :
    int data;
    ListNode* next;
    public :
    ListNode() :data(0), next(0){};
    ListNode(int a) :data(a),next(0){};
    friend class LinkedList;
};
class LinkedList{
    private:
    ListNode* first;
    public:
    LinkedList():first(0){};
    void print();
    void push_back(int x);
    void push_front(int x);
    void Delete(int x);
    void clear();
    void reverse();
};

void LinkedList::print(){
    if (first == 0){                // 如果first node指向NULL, 表示list沒有資料
        cout<<"list is empty"<<endl;
        return;
    }

    ListNode* current = first;      //pointer *current移動
    while (current != 0){           //Traversal
        cout<< current->data<<" "; 
        current = current->next;
    }
    cout<<endl;
}

void LinkedList:: push_front(int x){

    ListNode* newnode = new ListNode(x);//配置新區塊
    newnode->next =first;              //first接在newnode後
    first = newnode;                //再把first指向newnode所指記憶體位置
}
void LinkedList:: push_back(int x){ //從尾巴新增資料

    ListNode* newnode = new ListNode(x);   //配置新的區塊

    if(first == 0){                  //若list沒有node,令newnode為first
        first = newnode;            
        return;
    }
    ListNode* current = first;

    while(current->next!=0){
        current = current->next;      //Traversal到最後 找出尾巴
    }
    current->next = newnode;          //將newnode接再list尾巴
}

void LinkedList::Delete(int x){

    ListNode* current = first,
            *previous = 0;

    while(current!=0 && current->data !=x){  //Traversal
        previous = current;              //current指向NULL or current->data ==x
        current = current->next;         //結束while loop
    }
    if(current == first){                //list為empty or 沒有要刪的node 
        cout<<"There is no "<<x<<"in listt.\n";
        return;
    }
    else if(current == first){          //要刪除的node 在list的開頭
        first = current->next;          //first 移到下一個node
        delete current;
        current = 0;                    //delete current後指向NULL
        return;
    }
    else{                               // node 不為first previous不為NULL
        previous->next = current->next; 
        delete current;
        current = 0;
        return;
    }
}

void LinkedList::clear(){
    
    while(first != 0){      //Traversal
        ListNode* current = first;
        first = first->next;
        delete current;
        current =0;
    }
}

void LinkedList::reverse(){

    if(first ==0||first->next==0){ //list is empty or only node
        return;	
    }
    ListNode* previous =0;
    ListNode* current = first;
    ListNode* preceding = first->next;

    while(preceding!=0){
        current->next = previous;     // current->next轉向
        previous = current;           // previous後移
        current = preceding;          // current後移
        preceding = current->next;    // preceding後移
    }                                 // preceding更新成NULL 結束while

    current->next =previous;          // 
    first = current;

}

int main(){
    LinkedList list;
    list.print(); //空
    list.push_back(6); //6
    list.push_back(4); //6 4
    list.push_front(8); //8 6 4
    list.print(); //印出 8 6 4
    list.push_back(2); //8 6 4 2
    list.Delete(8); //6 4 2
    list.print(); //印出 6 4 2
    list.push_front(5); //5 6 4 2
    list.print(); //印出 5 6 4 2
    list.reverse(); //2 4 6 5
    list.print(); //印出 2 4 6 5
    list.clear(); //清空list
    list.print(); //印出 List is empty.

    return 0;
}
