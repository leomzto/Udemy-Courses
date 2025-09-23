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
                while (temp->next) {
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

        bool insert(int index, int value) {
            if (index < 0 || index > length) return false;
            if (index == 0) {
                prepend(value);
                return true;
            }
            if (index == length) {
                append(value);
                return true;
            }
            Node* newNode = new Node(value);
            Node* temp = get(index - 1);
            newNode->next = temp->next;
            temp->next = newNode;
            length++;
            return true;
        }       

        // WRITE DELETENODE MEMBER FUNCTION HERE //
        //                                       //
        //                                       //
        //                                       //
        //                                       //
        //                                       //
        ///////////////////////////////////////////

        void deleteNode(int index)
        {
            if (index < 0 || index >= length)
                return;

            if (length == 0)
                return;
            else if (head == tail)
            {
                delete head;
                head = tail = nullptr;
                length = 0;
                return;
            }

            if (index == 0)
                return deleteFirst();

            else if (index == length - 1)
                return deleteLast();

            Node* temp = get(index);
            Node* pre = get(index - 1);

            pre->next = temp->next;
            delete temp;

            length--;
        }

};



int main() {
        
    LinkedList* myLinkedList = new LinkedList(1);
    myLinkedList->append(2);
    myLinkedList->append(3);
    myLinkedList->append(4);
    myLinkedList->append(5);


    cout << "LL before deleteNode():\n";
    myLinkedList->printList();


    myLinkedList->deleteNode(2);
    cout << "\nLL after deleteNode() in middle:\n";
    myLinkedList->printList();


    myLinkedList->deleteNode(0);
    cout << "\nLL after deleteNode() of first node:\n";
    myLinkedList->printList();


    myLinkedList->deleteNode(2);
    cout << "\nLL after deleteNode() of last node:\n";
    myLinkedList->printList();


    /* 
        EXPECTED OUTPUT:
        ----------------
        LL before deleteNode():
        1
        2
        3
        4
        5

        LL after deleteNode() in middle:
        1
        2
        4
        5

        LL after deleteNode() of first node:
        2
        4
        5

        LL after deleteNode() of last node:
        2
        4

    */
        
}

