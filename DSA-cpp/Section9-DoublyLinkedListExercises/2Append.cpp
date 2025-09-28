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

		// WRITE APPEND MEMBER FUNCTION HERE //
		//                                   //
		//                                   //
	    //                                   //
	    //                                   //
	    //                                   //
	    ///////////////////////////////////////

        void append(int value)
        {
            Node* newNode = new Node(value);

            if (!head) // or length == 0
                head = tail = newNode;
            
            else
            {
                tail->next = newNode;
                newNode->prev = tail;
                tail = newNode;
            }

            length++;
        }
};



int main() {
        
    DoublyLinkedList* myDLL = new DoublyLinkedList(1);

    myDLL->append(2);

    myDLL->getHead();
    myDLL->getTail();
    myDLL->getLength();

    cout << "\nDoubly Linked List:\n";
    myDLL->printList();
    
    /*
        EXPECTED OUTPUT:
        ----------------
        Head: 1
        Tail: 2
        Length: 2
    
        Doubly Linked List:
        1
        2
    
    */
        
}

