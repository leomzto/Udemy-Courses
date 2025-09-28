#include <iostream>

using namespace std;


class Node { 
    public: 
        int value;
        Node* next;
        Node* prev;
    
        Node(int value) {
            this->value = value;
            this->next = nullptr;
            this->prev = nullptr;
        }
};


class DoublyLinkedList {
    private:
        Node* head;
        Node* tail;
        int length;

    public:
        DoublyLinkedList(int value) {
            Node* newNode = new Node(value);
            head = newNode;
            tail = newNode;
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
                newNode->prev = tail;
                tail = newNode;
            }
            length++;
        }

        void deleteLast() {
            if (length == 0) return;
            Node* temp = tail;
            if (length == 1) {
                head = nullptr;
                tail = nullptr;
            } else {
                tail = tail->prev;
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

            if (!head)
                head = tail = newNode;
            else
            {
                newNode->next = head;
                head->prev = newNode;
                head = newNode;
            }
            length++;
        }

};



int main() {
        
    DoublyLinkedList* myDLL = new DoublyLinkedList(2);
    myDLL->append(3);

    cout << "DLL before prepend(1):\n";
    cout << "----------------------\n";
    myDLL->printList();
    cout << endl;

    myDLL->getHead();
    myDLL->getTail();
    myDLL->getLength();

    myDLL->prepend(1);

    cout << "\n\nDLL after prepend(1):\n";
    cout << "---------------------\n";
    myDLL->printList();
    cout << endl;

    myDLL->getHead();
    myDLL->getTail();
    myDLL->getLength();

    /*
        EXPECTED OUTPUT:
        
        DLL before prepend(1):
        ----------------------
        2
        3

        Head: 2
        Tail: 3
        Length: 2


        DLL after prepend(1):
        ---------------------
        1
        2
        3

        Head: 1
        Tail: 3
        Length: 3
    
    */
        
}


