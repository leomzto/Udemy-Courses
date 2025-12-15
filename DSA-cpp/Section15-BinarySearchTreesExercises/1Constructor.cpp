#include <iostream>

using namespace std;

class Node {

    public:
        int value;
        Node* left;
        Node* right;

        Node(int value) : value(value), left(nullptr), right(nullptr) {}
};


class BinarySearchTree {
    public:
		// CREATE MEMBER VARIABLE HERE //
		//                             //
		//                             //
		//                             //
		//                             //
		/////////////////////////////////
        Node* root;

    public:
		// CREATE BST CONSTRUCTOR HERE //
		//                             //
		//                             //
		//                             //
		//                             //
		/////////////////////////////////

        BinarySearchTree() : root(nullptr) {}
		


        // ---------------------------------------------------
        //  Below is a helper function used by the destructor
        //  Deletes all nodes in BST
        //  Similar to DFS PostOrder in Tree Traversal section
        // ---------------------------------------------------
        void destroy(Node* currentNode) {
            if (currentNode->left) destroy(currentNode->left);
            if (currentNode->right) destroy(currentNode->right);
            delete currentNode;
        }

        ~BinarySearchTree() { destroy(root); }
        
};



int main() {
        
    BinarySearchTree* myBST = new BinarySearchTree();

    // ROOT MUST BE PUBLIC FOR THIS LINE TO WORK:
    cout << "Root: " << myBST->root;

    /*
        EXPECTED OUTPUT:
        ----------------
        Root: 0x0

    */

}

