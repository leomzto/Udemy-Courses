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
        
        bool rContains(Node* currentNode, int value) {
            if (currentNode == nullptr) return false;
            
            if (currentNode->value == value) return true;
            
            if (value < currentNode->value) {
                return rContains(currentNode->left, value);
            } else {
                return rContains(currentNode->right, value);
            }
        }
        bool rContains(int value) { 
            return rContains(root, value); 
        } 

        int minValue(Node* currentNode) {
            while (currentNode->left != nullptr) {
                currentNode = currentNode->left;
            }
            return currentNode->value;
        } 
              
        //   +===================================================+
        //   |              WRITE YOUR CODE HERE                 |
        //   | Description:                                      |
        //   | - Deletes a node with a specific value from a     |
        //   |   binary search tree (BST) and maintains the      |
        //   |   BST properties after deletion.                  |
        //   |                                                   |
        //   | Parameters:                                       |
        //   | - currentNode: The node currently being examined. |
        //   | - value: The value of the node to be deleted.     |
        //   |                                                   |
        //   | Return:                                           |
        //   | - The modified tree's root node after deletion.   |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - If the value is less/more than the current node,|
        //   |   recursively search in the left/right subtree.   |
        //   | - If the node to delete is found and has no child,|
        //   |   delete the node and return null.                |
        //   | - If the node has one child, delete the node and  |
        //   |   return the child.                               |
        //   | - If the node has two children, find the minimum  |
        //   |   value in the right subtree, replace the node's  |
        //   |   value with this minimum value, and then delete  |
        //   |   the minimum value node in the right subtree.    |
        //   +===================================================+

        Node* deleteNode(Node* currentNode, int value)
        {
            if (!currentNode) return nullptr;

            if (value < currentNode->value)
                currentNode->left = deleteNode(currentNode->left, value);

            else if (value > currentNode->value)
                currentNode->right = deleteNode(currentNode->right, value);

            else
            {
                if (!currentNode->left && !currentNode->right)
                {
                    delete(currentNode);
                    return nullptr;
                }
                else if (!currentNode->left)
                {
                    Node* temp = currentNode->right;
                    delete(currentNode);
                    return temp;
                }
                else if (!currentNode->right)
                {
                    Node* temp = currentNode->left;
                    delete(currentNode);
                    return temp;
                }
                else
                {
                    int subTreeMin = minValue(currentNode->right);
                    currentNode->value = subTreeMin;
                    currentNode->right = deleteNode(currentNode->right, subTreeMin);
                }
            }

            return currentNode;
            
        }

        void deleteNode(int value) { root = deleteNode(root, value); }

};

