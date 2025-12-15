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
                
        Node* rInsert(Node* currentNode, int value) {
            if (currentNode == nullptr) return new Node(value);
        
            if (value < currentNode->value) {
                currentNode->left = rInsert(currentNode->left, value);
            } else if (value > currentNode->value) {
                currentNode->right = rInsert(currentNode->right, value);
            } 
            return currentNode;
        }
        void rInsert(int value) { 
            if (root == nullptr) root = new Node(value);
            rInsert(root, value); 
        } 

        //   +===================================================+
        //   |              WRITE YOUR CODE HERE                 |
        //   | Description:                                      |
        //   | - Finds the minimum value in a binary search tree |
        //   |   by traversing down the left children of nodes.  |
        //   |                                                   |
        //   | Parameters:                                       |
        //   | - currentNode: The starting node of the tree.     |
        //   |                                                   |
        //   | Return:                                           |
        //   | - Returns the value of the leftmost node, which   |
        //   |   represents the minimum value in the tree.       |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - The method iteratively moves to the left child  |
        //   |   of each node, reaching the leftmost node which  |
        //   |   does not have a left child.                     |
        //   | - This leftmost node contains the minimum value   |
        //   |   in the tree, following the properties of a BST. |
        //   +===================================================+

        int minValue(Node* currentNode)
        {
            while (currentNode->left)
                currentNode = currentNode->left;

            return currentNode->value;
        }

};

