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
        
        void push(int value) {
            Node* newNode = new Node(value);
            newNode->next = top;
            top = newNode;
            height++;
        }

        //   +=====================================================+
        //   |                 WRITE YOUR CODE HERE                |
        //   | Description:                                        |
        //   | - This is the pop function for the Stack class.     |
        //   | - It removes the top element from the stack.        |
        //   | - The method updates the 'top' of the stack and     |
        //   |   decrements the 'height'.                          |
        //   | - Return type: int (returns the value of the        |
        //   |   popped node, or INT_MIN if the stack is empty)    |
        //   |                                                     |
        //   | Tips:                                               |
        //   | - Check if the stack is empty (height == 0).        |
        //   |   If it is, return INT_MIN.                         |
        //   | - Store the current 'top' node in a temporary       |
        //   |   variable.                                         |
        //   | - Update 'top' to point to the next node.           |
        //   | - Delete the temporary node.                        |
        //   | - Decrement 'height' by 1.                          |
        //   | - Return the value of the popped node.              |
        //   | - Check output from Test.cpp in "User logs".        |
        //   +=====================================================+

        int pop()
        {
            if (!top)
                return INT_MIN;

            Node* temp = top;
            top =  top->next;

            int poped = temp->value;
            delete temp;
            height--;

            return poped;
        }

};


