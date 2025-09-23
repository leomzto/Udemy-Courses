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

            if (length == 0)
            {
                head = tail = newNode;
                return;
            }

            tail->next = newNode;
            tail = newNode;

            length++;
        }
	    
};



int main() {
        
    LinkedList* myLinkedList = new LinkedList(1);

    myLinkedList->append(2);

    myLinkedList->getHead();
    myLinkedList->getTail();
    myLinkedList->getLength();

    cout << endl << "Linked List:" << endl;
    myLinkedList->printList();  


    /*  
        EXPECTED OUTPUT:
    	----------------
        Head: 1
        Tail: 2
        Length: 2

        Linked List:
        1
        2

    */
}
