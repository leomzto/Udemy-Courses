/*
LL: Find Kth Node From End ( ** Interview Question)

Implement the findKthFromEnd member function for the LinkedList class, which returns the k-th node from the end of the linked list WITHOUT USING THE LENGTH of the list.
If the value of k is greater than the length of the list, the function should return nullptr.


Function signature:
    Node* findKthFromEnd(int k)

Example:
    Consider the following singly linked list:
        1 -> 2 -> 3 -> 4 -> 5 -> nullptr

For the given list, the function ll.findKthFromEnd(2) should return the node with value 4, as it is the 2nd node from the end of the list.
*/

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
        
    public:
        LinkedList(int value) {
            Node* newNode = new Node(value);
            head = newNode;
            tail = newNode;
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

        Node* getTail() {
            return tail; 
        }
        
        void makeEmpty() {
            Node* temp = head;
            while (head) {
                head = head->next;
                delete temp;
                temp = head;
            }
            tail = nullptr;
        }

        void append(int value) {
            Node* newNode = new Node(value);
            if (head == nullptr) {
                head = newNode;
                tail = newNode;
            } else {
                tail->next = newNode;
                tail = newNode;
            }
        }

        //   +======================================================+
        //   |                 WRITE YOUR CODE HERE                 |
        //   | Description:                                         |
        //   | - Find the k-th node from the end of the list        |
        //   | - Return type: Node*                                 |
        //   |                                                      |
        //   | Tips:                                                |
        //   | - Use two pointers: 'slow' and 'fast'                |
        //   | - Move 'fast' k nodes ahead first                    |
        //   | - If 'fast' reaches null, k is too large             |
        //   | - Then move both 'slow' and 'fast' until end         |
        //   | - Return 'slow' as the k-th node from the end        |
        //   +======================================================+

        Node* findKthFromEnd(int k)
        {
            if (head == nullptr)
                return nullptr;

            if (head == tail || k == 1)
                return tail;

            Node* slow = head;
            Node* fast = head;


            for (int i = 0; i < k; i++)
            {
                if (fast == nullptr)
                    return nullptr;

                fast = fast->next;
            }

            while (fast != nullptr)
            {
                fast = fast->next;
                slow = slow->next;
            }

            return slow;
        }

};


