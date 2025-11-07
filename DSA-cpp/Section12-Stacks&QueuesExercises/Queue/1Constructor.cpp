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
        //   +====================================================+
        //   |                 WRITE YOUR CODE HERE               |
        //   | Description:                                       |
        //   | - This is the constructor for the Queue class.     |
        //   | - It takes an integer value to initialize the      |
        //   |   queue with a single node.                        |
        //   | - The method sets up the 'first' and 'last'        |
        //   |   pointers, and initializes the 'length'.          |
        //   | - Return type: n/a (constructor)                   |
        //   |                                                    |
        //   | Tips:                                              |
        //   | - Create a new Node object with the given value.   |
        //   | - Set 'first' and 'last' to point to this node.    |
        //   | - Set 'length' to 1 as there is one node.          |
        //   | - Check output from Test.cpp in "User logs".       |
        //   +====================================================+
        
        Queue(int value) : first(new Node(value)), last(first), length(1) {}

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

        bool isEmpty() {
            if (length == 0) return true;
            return false;
        }
        
};


