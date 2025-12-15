#include <iostream>

using namespace std;


class Node { 
    public: 
        int value;
        Node* left;
        Node* right;

        Node(int value) {
            this->value = value;
            left = nullptr;
            right = nullptr;
        }
};


class BinarySearchTree {
    public:
        Node* root;

    public:
        BinarySearchTree() { root = nullptr; }

        // ---------------------------------------------------
        //  Below is a helper function used by the destructor
        //  Deletes all nodes in BST
        //  Similar to DFS PostOrder in Tree Traversal section
        // ---------------------------------------------------
        void destroy(Node* currentNode) {
            if (currentNode == nullptr) return;
            if (currentNode->left) destroy(currentNode->left);
            if (currentNode->right) destroy(currentNode->right);
            delete currentNode;
        }

        ~BinarySearchTree() { destroy(root); }

        Node* getRoot() {
            return root;
        } 

        bool insert(int value) {
            Node* newNode = new Node(value);
            if (root == nullptr) {
                root = newNode;
                return true;
            }
            Node* temp = root;
            while(true) {
                if (newNode->value == temp->value) return false;
                if (newNode->value < temp->value) {
                    if (temp->left == nullptr) {
                        temp->left = newNode;
                        return true;
                    }
                    temp = temp->left;
                } else {
                    if (temp->right == nullptr) {
                        temp->right = newNode;
                        return true;
                    }
                    temp = temp->right;
                }
            }
        }


        //   +===================================================+
        //   |              WRITE YOUR CODE HERE                 |
        //   | Description:                                      |
        //   | - Recursively checks if a binary search tree      |
        //   |   contains a node with the given value.           |
        //   |                                                   |
        //   | Parameters:                                       |
        //   | - currentNode: The node currently being checked.  |
        //   | - value: The value being searched for.            |
        //   |                                                   |
        //   | Return:                                           |
        //   | - Returns true if the value is found in the tree; |
        //   |   otherwise, returns false.                       |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - Starts the search from the currentNode and      |
        //   |   traverses the tree down to its children based   |
        //   |   on the value being greater or lesser than the   |
        //   |   currentNode's value, following BST properties.  |
        //   | - If a null node is reached, the value is not     |
        //   |   present in the tree and false is returned.      |
        //   | - If the node with the value is found, returns    |
        //   |   true.                                           |
        //   +===================================================+

        bool rContains(Node* currentNode, int value)
        {
            if (!currentNode) return false;

            if (value == currentNode->value) return true;

            if (value < currentNode->value)
                rContains(currentNode->left, value);
            else
                rContains(currentNode->right, value);
        }

        bool rContains(int value) { 
            return rContains(root, value); 
        } 

};

