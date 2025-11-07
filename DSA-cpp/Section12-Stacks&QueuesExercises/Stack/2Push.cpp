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

class Stack {
    private:
        Node* top;
        int height;
        
    public:
        Stack(int value) {
            Node* newNode = new Node(value);
            top = newNode;
            height = 1;
        }
    
        ~Stack() {
            Node* temp = top;
            while (top) {
                top = top->next;
                delete temp;
                temp = top;
            }
        }
    
        void printStack() {
            Node* temp = top;
            while (temp) {
                cout << temp->value << endl;
                temp = temp->next;
            }
        }
    
        Node* getTop() {
            return top;
        }

        int topValue() {
            if (top) return top->value;
            return INT_MIN;
        }
    
        int getHeight() {
            return height;
        }
        
        void makeEmpty() {
            Node* temp;
            while (top) {
                temp = top;
                top = top->next;
                delete temp;
            }
            height = 0;
        }

        //   +=====================================================+
        //   |                 WRITE YOUR CODE HERE                |
        //   | Description:                                        |
        //   | - This is the push function for the Stack class.    |
        //   | - It takes an integer value to add to the stack.    |
        //   | - The method creates a new node and makes it the    |
        //   |   new 'top' of the stack.                           |
        //   | - It also increments the 'height' of the stack.     |
        //   | - Return type: void                                 |
        //   |                                                     |
        //   | Tips:                                               |
        //   | - Create a new Node object with the given value.    |
        //   | - Set the 'next' pointer of the new node to point   |
        //   |   to the current 'top'.                             |
        //   | - Update 'top' to point to the new node.            |
        //   | - Increment 'height' by 1.                          |
        //   | - Check output from Test.cpp in "User logs".        |
        //   +=====================================================+

        void push(int value)
        {
            Node* newNode = new Node(value);
            newNode->next = top;
            top = newNode;
            height++;
        }

};


