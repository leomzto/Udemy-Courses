 /*
 LL: Remove Duplicates ( ** Interview Question)

Implement the removeDuplicates member function for the LinkedList class, which removes all duplicate values from a singly linked list.
The function should preserve the original order of the non-duplicate elements.

Note:  This linked list class does NOT have a tail which will make this method easier to implement.


Function Signature:
    void removeDuplicates()


Example:
    Consider the following singly linked list:
        1 -> 2 -> 3 -> 2 -> 4 -> 5 -> 3 -> nullptr


For the given list, after calling the function ll.removeDuplicates(), the list should be modified to be:
    1 -> 2 -> 3 -> 4 -> 5 -> nullptr

All duplicate values have been removed, and the remaining elements maintain their original order.
 */

 #include <iostream>
#include <unordered_set>

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
        int length;
        
    public:
        LinkedList(int value) {
            Node* newNode = new Node(value);
            head = newNode;
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
            if (temp == nullptr) {
                cout << "empty";
            } else {
                while (temp != nullptr) {
                    cout << temp->value;
                    temp = temp->next;
                    if (temp != nullptr) {
                        cout << " -> ";
                    }
                }
            }
            cout << endl;
        }

        Node* getHead() {
            return head;
        }

        int getLength() {
            return length;
        }
        
        void makeEmpty() {
            Node* temp = head;
            while (head) {
                head = head->next;
                delete temp;
                temp = head;
            }
            length = 0;
        }

        void append(int value) {
            Node* newNode = new Node(value);
            if (head == nullptr) {
                head = newNode;
            } else {
                Node* currentNode = head;
                while (currentNode->next != nullptr) {
                    currentNode = currentNode->next;
                }
                currentNode->next = newNode;
            }
            length++;
        }

        //   +======================================================+
        //   |                 WRITE YOUR CODE HERE                 |
        //   | Description:                                         |
        //   | - Remove duplicate nodes from the list               |
        //   | - Return type: void                                  |
        //   |                                                      |
        //   | Tips:                                                |
        //   | - Use two pointers: 'current' and 'runner'           |
        //   | - 'current' scans each node                          |
        //   | - 'runner' checks for duplicates ahead               |
        //   | - If duplicate found, delete it                      |
        //   | - Update 'next' pointers and reduce length           |
        //   | - No return value, list updated in-place             |
        //   +======================================================+

        void removeDuplicates()
        {
            if (head == nullptr)
                return;

            Node* temp = head;
            
                while (temp != nullptr)
                {
                    Node* check = temp;

                    while (check->next != nullptr)
                    {
                        if (check->next->value == temp->value)
                        {
                            Node* rmv = check->next;
                            check->next = check->next->next;

                            delete rmv;

                            length--;
                        } 
                        else
                            check = check->next;
                    }

                    temp = temp->next;
                }
            }


};


