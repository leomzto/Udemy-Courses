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

class Queue {
    private:
        Node* first;
        Node* last;
        int length;

    public:
        Queue(int value) {
            Node* newNode = new Node(value);
            first = newNode;
            last = newNode;
            length = 1;
        }

        ~Queue() {
            Node* temp = first;
            while (first) {
                first = first->next;
                delete temp;
                temp = first;
            }
        }

        void printQueue() {
            if (length == 0) {
                cout << "Queue: empty" << endl;
                return;
            }
            Node* temp = first;
            cout << "Queue: ";
            while (temp) {
                cout << temp->value;
                temp = temp->next;
                if (temp) {
                    cout << " -> ";
                }
            }
            cout << endl;
        }


        Node* getFirst() {
            return first;
        }

        Node* getLast() {
            return last;
        }

        int getLength() {
            return length;
        }
        
        void makeEmpty() {
            Node* temp;
            while (first) {
                temp = first;
                first = first->next;
                delete temp;
            }
            first = nullptr;
            last = nullptr;
            length = 0;
        }

        bool isEmpty() {
            if (length == 0) return true;
            return false;
        }

        //   +====================================================+
        //   |                 WRITE YOUR CODE HERE               |
        //   | Description:                                       |
        //   | - This method adds a new node to the end of the    |
        //   |   queue (enqueue).                                 |
        //   | - It takes an integer value for the new node.      |
        //   | - Updates 'last' pointer and increases 'length'.   |
        //   | - Return type: void                                |
        //   |                                                    |
        //   | Tips:                                              |
        //   | - Create a new Node with the given value.          |
        //   | - If queue is empty, set 'first' and 'last'.       |
        //   | - Else, set 'last->next' and update 'last'.        |
        //   | - Increment the 'length'.                          |
        //   | - Check output from Test.cpp in "User logs".       |
        //   +====================================================+

        void enqueue(int value)
        {
            Node* newNode = new Node(value);

            if (isEmpty())
                first = last = newNode;

            else
            {
                last->next = newNode;
                last = newNode;
            }

            length++;
        }
        
};


