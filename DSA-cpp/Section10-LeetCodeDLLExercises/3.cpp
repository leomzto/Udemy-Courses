#include <iostream>

using namespace std;

class Node { 
    public: 
        int value;
        Node* next;
        Node* prev;
    
        Node(int value) {
            this->value = value;
            next = nullptr;
            prev = nullptr;
        }
};

class DoublyLinkedList {
    private:
        Node* head;
        int length;
    
    public:
        DoublyLinkedList(int value) {
            Node* newNode = new Node(value);
            head = newNode;
            length = 1;
        }
    
        ~DoublyLinkedList() {
            Node* temp = head;
            while (head) {
                head = head->next;
                delete temp;
                temp = head;
            }
        }
    
        void printList() {
            Node* temp = head;
            if (temp == nullptr) {
                cout << "empty" << endl;
                return;
            }
            while (temp->next != nullptr) {
                cout << temp->value << " <-> ";
                temp = temp->next;
            }
            cout << temp->value << endl;
        }
    
        Node* getHead() {
            return head;
        }
    
        int getLength() {
            return length;
        }

        void makeEmpty() {
            Node* temp = head;
            while (head) {
                head = head->next;
                delete temp;
                temp = head;
            }
            length = 0;
        }

        void append(int value) {
            Node* newNode = new Node(value);
            if (length == 0) {
                head = newNode;
            } else {
                Node* temp = head;
                while (temp->next != nullptr) {
                    temp = temp->next;
                }
                temp->next = newNode;
                newNode->prev = temp;
            }
            length++;
        }
        
        void partitionList(int x) {
            //   +===================================================+
            //   |               WRITE YOUR CODE HERE                |
            //   | Description:                                      |
            //   | - Partitions a doubly linked list around a value  |
            //   |   `x`.                                            |
            //   | - Nodes with values < x come before nodes with    |
            //   |   values >= x, preserving original order.         |
            //   |                                                   |
            //   | Behavior:                                         |
            //   | - Uses two dummy nodes to build two sublists:     |
            //   |   one for values < x and one for values >= x.     |
            //   | - Traverses the list and adds each node to the    |
            //   |   appropriate sublist.                            |
            //   | - Reconnects the two sublists at the end.         |
            //   | - Properly updates both `.next` and `.prev`       |
            //   |   pointers.                                       |
            //   | - Updates `head` to the new start of the list.    |
            //   | - Deletes dummy nodes to free memory.             |
            //   +===================================================+
        }
        
};


