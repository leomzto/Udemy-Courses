#include <iostream>

using namespace std;

class Node
{

    public:

        int value;
        Node* next;

        Node(int value) : value(value), next(nullptr) {};
};

class LinkedList
{

    private:

        Node* head; 
        Node* tail;
        int length;
		
    
    public:
		
        LinkedList(int value)
        {
            Node* newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }

        ~LinkedList()
        {
            Node* temp = head;
            while (head)
            {
                head = head->next;
                delete temp;
                temp = head;
            }
        }

        void printList()
        {
            Node* temp = head;
            while (temp != nullptr)
            {
                cout << temp->value << endl;
                temp = temp->next;
            }
        }

        void getHead()
        {
            if (head == nullptr)
                cout << "Head: nullptr" << endl;
            else
                cout << "Head: " << head->value << endl;
        }

        void getTail()
        {
            if (tail == nullptr) 
                cout << "Tail: nullptr" << endl;
            else
                cout << "Tail: " << tail->value << endl;
        }

        void getLength()
        {
            cout << "Length: " << length << endl;
        }

};

int main() {
        
    LinkedList* myLinkedList = new LinkedList(4);

    myLinkedList->getHead();
    myLinkedList->getTail();
    myLinkedList->getLength();
    
    cout << "\nLinked List:\n";
    myLinkedList->printList();

    /*  
        EXPECTED OUTPUT:
    	----------------
        Head: 4
        Tail: 4
        Length: 1

        Linked List:
        4

    */
       
}

