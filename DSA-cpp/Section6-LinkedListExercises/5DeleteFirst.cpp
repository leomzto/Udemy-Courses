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

        // WRITE DELETEFIRST MEMBER FUNCTION HERE //
        //                                        //
        //                                        //
        //                                        //
        //                                        //
        //                                        //
        ////////////////////////////////////////////    
        
        void deleteFirst()
        {
            if (length == 0) return;

            if (head == tail)
            {
                delete (head);
                head = tail = nullptr;
                return;
            }

            Node* temp = head;
            head = head->next;
            delete(temp);

            length--;
        }

};


int main() {
        
    LinkedList* myLinkedList = new LinkedList(2);
    myLinkedList->append(1);


    cout << "LL before deleteFirst():\n";
    myLinkedList->printList();


    myLinkedList->deleteFirst();
    cout << "\n\nLL after 1st deleteFirst():\n";
    myLinkedList->printList();


    myLinkedList->deleteFirst();
    cout << "\n\nLL after 2nd deleteFirst():\n";
    myLinkedList->printList();


    myLinkedList->deleteFirst();
    cout << "\n\nLL after 3rd deleteFirst():\n";
    myLinkedList->printList();


    /* 
        EXPECTED OUTPUT:
        ----------------
        LL before deleteFirst():
        2
        1


        LL after 1st deleteFirst():
        1


        LL after 2nd deleteFirst():


        LL after 3rd deleteFirst():
    
    */
    
}

