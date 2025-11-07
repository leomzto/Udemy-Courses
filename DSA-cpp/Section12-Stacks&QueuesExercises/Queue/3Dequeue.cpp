#include <iostream>
#include <climits>

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

        void enqueue(int value) {
            Node* newNode = new Node(value);
            if (length == 0) {
                first = newNode;
                last = newNode;
            } else {
                last->next = newNode;
                last = newNode;
            }
            length++;
        }
        
        //   +=====================================================+
        //   |                 WRITE YOUR CODE HERE                |
        //   | Description:                                        |
        //   | - This method removes a node from the front         |
        //   |   of the queue (dequeue).                           |
        //   | - Updates 'first' pointer and decreases 'length'.   |
        //   | - If the queue is empty, it returns INT_MIN.        |
        //   | - Otherwise, returns the value of the removed node. |
        //   | - Return type: int                                  |
        //   |                                                     |
        //   | Tips:                                               |
        //   | - If queue is empty, return INT_MIN.                |
        //   | - Create a temporary pointer to store 'first'.      |
        //   | - Update 'first' to point to the next node.         |
        //   | - Delete the old 'first' node.                      |
        //   | - Decrement the 'length'.                           |
        //   | - Return the value of the removed node.             |
        //   | - Check output from Test.cpp in "User logs".        |
        //   +=====================================================+

        int dequeue()
        {
            if (isEmpty())
                return INT_MIN;

            Node* temp = first;

            int dequeued = first->value;

            if (first == last)
                first = last = nullptr;

            else    
                first = first->next;

            delete temp;
            length--;

            return dequeued;
        }
        
};


