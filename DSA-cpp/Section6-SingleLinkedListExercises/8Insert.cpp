#include <iostream>

using namespace std;


class Node { 
    public:
        int value;
        Node* next;

        Node(int value) {
            this->value = value;
            next = nullptr;
        }
}; 


class LinkedList {
    private:
        Node* head;
        Node* tail;
        int length;

    public:
        LinkedList(int value) {
            Node* newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }

        ~LinkedList() {
            Node* temp = head;
            while (head) {
                head = head->next;
                delete temp;
                temp = head;
            }
        }

        void printList() {
            Node* temp = head;
            while (temp != nullptr) {
                cout << temp->value << endl;
                temp = temp->next;
            }
        }

        void getHead() {
            if (head == nullptr) {
                cout << "Head: nullptr" << endl;
            } else {
                cout << "Head: " << head->value << endl;
            }
        }

        void getTail() {
            if (tail == nullptr) {
                cout << "Tail: nullptr" << endl;
            } else { 
                cout << "Tail: " << tail->value << endl;
            }  
        }

        void getLength() {
            cout << "Length: " << length << endl;
        }

        void append(int value) {
            Node* newNode = new Node(value);
            if (length == 0) {
                head = newNode;
                tail = newNode;
            } else {
                tail->next = newNode;
                tail = newNode;
            }
            length++;
        }

        void deleteLast() {
            if (length == 0) return;
            Node* temp = head;
            if (length == 1) {
                head = nullptr;
                tail = nullptr;
            } else {
                Node* pre = head;
                while(temp->next) {
                    pre = temp;
                    temp = temp->next;
                }
                tail = pre;
                tail->next = nullptr;
            }
            delete temp;
            length--;            
        }

        void prepend(int value) {
            Node* newNode = new Node(value);
            if (length == 0) {
                head = newNode;
                tail = newNode;
            } else {
                newNode->next = head;
                head = newNode;
            }
            length++;
        }

       void deleteFirst() {
            if (length == 0) return;
            Node* temp = head;
            if (length == 1) {
                head = nullptr;
                tail = nullptr;
            } else {
                head = head->next;
            }
            delete temp;
            length--;
        }

        Node* get(int index) {
            if (index < 0 || index >= length) return nullptr;
            Node* temp = head;
            for (int i = 0; i < index; ++i) {
                temp = temp->next;
            }
            return temp;
        }

        bool set(int index, int value) {
            Node* temp = get(index);
            if (temp) {
                temp->value = value;
                return true;
            } 
            return false;
        }

 		// WRITE INSERT MEMBER FUNCTION HERE //
        //                                   //
        //                                   //
        //                                   //
        //                                   //
        //                                   //
        /////////////////////////////////////// 
        
        bool insert(int index, int value)
        {
            if (index < 0 || index > length)
                return false;

            if (index == 0)
            {
                prepend(value);
                return true;
            }

            if (index == length)
            {
                append(value);
                return true;
            }

            Node* newNode = new Node(value);
            Node* pre = get(index - 1);

            newNode->next = pre->next;
            pre->next = newNode;

            length++;

            return true;
        }

};



int main() {
        
    LinkedList* myLinkedList = new LinkedList(1);
    myLinkedList->append(3);

    cout << "LL before insert():" << endl;
    myLinkedList->printList();

    

    myLinkedList->insert(1, 2);

    cout << "\nLL after insert(2) in middle:\n";
    myLinkedList->printList();


    myLinkedList->insert(0, 0);

    cout << "\nLL after insert(0) at beginning:\n";
    myLinkedList->printList();

    myLinkedList->insert(4, 4);

    cout << "\nLL after insert(4) at end:\n";
    myLinkedList->printList();


    /*  EXPECTED OUTPUT:
        ----------------
        LL before insert():
        1
        3

        LL after insert(2) in middle:
        1
        2
        3

        LL after insert(0) at beginning:
        0
        1
        2
        3

        LL after insert(4) at end:
        0
        1
        2
        3
        4
    
    */
  
}

