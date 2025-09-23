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

        // WRITE PREPEND MEMBER FUNCTION HERE //
        //                                    //
        //                                    //
        //                                    //
        //                                    //
        //                                    //
        ////////////////////////////////////////   
        
        void prepend(int value)
        {
            Node* newNode = new Node(value);

            if (length == 0)
                head = tail = newNode;  
            else
            {
                newNode->next = head;
                head = newNode;
            }
            
            length++;
        }

};


int main() {
        
    LinkedList* myLinkedList = new LinkedList(2);
    myLinkedList->append(3);

    cout << "LL before prepend(1):\n";
    cout << "--------------------\n";
    myLinkedList->printList();
    cout << endl;

    myLinkedList->getHead();
    myLinkedList->getTail();
    myLinkedList->getLength();

    myLinkedList->prepend(1);

    cout << "\n\nLL after prepend(1):\n";
    cout << "--------------------\n";
    myLinkedList->printList();
    cout << endl;

    myLinkedList->getHead();
    myLinkedList->getTail();
    myLinkedList->getLength();


    /*  EXPECTED OUTPUT:
        
        LL before prepend():
        --------------------
        2
        3

        Head: 2
        Tail: 3
        Length: 2


        LL after prepend(1):
        1
        2
        3

        Head: 1
        Tail: 3
        Length: 3
    
    */
          
}

