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

        void prepend(int value) {
            Node* newNode = new Node(value);
            if (length == 0) {
                head = newNode;
                tail = newNode;
            } else {
                newNode->next = head;
                head->prev = newNode;
                head = newNode;
            }
            length++;
        }

        // WRITE DELETEFIRST MEMBER FUNCTION HERE //
        //                                        //
        //                                        //
        //                                        //
        //                                        //
        //                                        //
        ////////////////////////////////////////////  

        void deleteFirst()
        {
            if (!head)
                return;
                
            Node* temp = head;
            if (head == tail)
                head = tail = nullptr;
            else
            {
                head = head->next;
                head->prev = nullptr;
            }

            delete temp;
            length--;
        }

};



int main() {
        
    DoublyLinkedList* myDLL = new DoublyLinkedList(2);
    myDLL->append(1);


    cout << "DLL before deleteFirst():\n";
    myDLL->printList();


    myDLL->deleteFirst();
    cout << "\n\nDLL after 1st deleteFirst():\n";
    myDLL->printList();


    myDLL->deleteFirst();
    cout << "\n\nDLL after 2nd deleteFirst():\n";
    myDLL->printList();


    myDLL->deleteFirst();
    cout << "\n\nDLL after 3rd deleteFirst():\n";
    myDLL->printList();

     /*  
        EXPECTED OUTPUT:
        ----------------
        DLL before deleteFirst():
        2
        1


        DLL after 1st deleteFirst():
        1


        DLL after 2nd deleteFirst():


        DLL after 3rd deleteFirst():
    
    */
    
}

