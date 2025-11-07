#include <iostream>

using namespace std;


	// CREATE NODE CLASS HERE //
	//                        //
	//                        //
	//                        //
	//                        //
	////////////////////////////
class Node {
    public:
    int value;
    Node* next;

    Node(int v) : value(v), next(nullptr) {}
};


class Stack {
    private:
		// CREATE MEMBER VARIABLES HERE //
		//                              //
		//                              //
		//                              //
		//                              //
		//////////////////////////////////

        Node* top;
        int height;

    public:
		// CREATE STACK CONSTRUCTOR HERE //
		//                               //
		//                               //
		//                               //
		//                               //
		///////////////////////////////////

        Stack(int v) {
            Node* newNode = new Node(v);
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

        void getTop() {
            if (top == nullptr) {
                cout << "Top: nullptr" << endl;
            } else {
                cout << "Top: " << top->value << endl;
            }
        }

        void getHeight() {
            cout << "Height: " << height << endl;
        }

};



int main() {
        
    Stack* myStack = new Stack(4);

    myStack->getTop();
    myStack->getHeight();

    cout << "\nStack:\n";
    myStack->printStack();

    /*  
        EXPECTED OUTPUT:
        ----------------
        Top: 4
        Height: 1

        Stack:
        4

    */

}

