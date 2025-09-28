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

        // WRITE DELETELAST MEMBER FUNCTION HERE //
        //                                       //
        //                                       //
        //                                       //
        //                                       //
        //                                       //
        ///////////////////////////////////////////

        void deleteLast()
        {
            if (!head)
                return;

            Node* temp = tail;
            if (head == tail) // or length == 1
                head = tail = nullptr;
            
            else
            {
                tail = tail->prev;
                tail->next = nullptr;
            }

            delete temp;
            length--;
        }
};



int main() {
        
    DoublyLinkedList* myDLL = new DoublyLinkedList(1);
    myDLL->append(2);


    cout << "DLL before deleteLast():\n";
    myDLL->printList();


    myDLL->deleteLast();
    cout << "\n\nDLL after 1st deleteLast():\n";
    myDLL->printList();


    myDLL->deleteLast();
    cout << "\n\nDLL after 2nd deleteLast():\n";
    myDLL->printList();


    myDLL->deleteLast();
    cout << "\n\nDLL after 3rd deleteLast():\n";
    myDLL->printList();

     /*
        EXPECTED OUTPUT:
        ----------------
        DLL before deleteLast():
        1
        2


        DLL after 1st deleteLast():
        1


        DLL after 2nd deleteLast():


        DLL after 3rd deleteLast():
    
    */
        
}

