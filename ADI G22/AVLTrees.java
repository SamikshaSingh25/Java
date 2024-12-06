class Node {
    int data, height;
    Node left, right;

    // Constructor to initialize a new node
    Node(int data) {
        this.data = data;
        this.height = 1;  // Initial height is 1
        this.left = this.right = null;
    }
}

class AVLTree {
    // 1. Function to get the height of a node
    int height(Node node) {
        if (node == null) return 0;
        return node.height;
    }

    // 2. Function to get the balance factor of a node
    int getBalance(Node node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    // 3. Function to print nodes that are unbalanced
    void printUnbalancedNodes(Node node) {
        if (node == null) return;

        int balance = getBalance(node);
        if (balance > 1 || balance < -1) {
            System.out.println("Unbalanced Node: " + node.data + ", Balance Factor: " + balance);
        }

        // Recursively check left and right subtrees
        printUnbalancedNodes(node.left);
        printUnbalancedNodes(node.right);
    }

    // 4. Function to print the heights of the left and right subtrees
    void printSubtreeHeights(Node node) {
        if (node != null) {
            System.out.println("Node: " + node.data);
            System.out.println("Left Height: " + height(node.left));
            System.out.println("Right Height: " + height(node.right));
        }
    }

    // 5. Function to check if the tree is balanced
    boolean isBalanced(Node node) {
        if (node == null) return true;

        int balance = getBalance(node);

        // A node is balanced if its balance factor is between -1 and 1
        return Math.abs(balance) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    // Helper function to perform in-order traversal
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    // Function to insert a node (simple binary tree insertion)
    Node insert(Node node, int data) {
        if (node == null) return new Node(data);

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            // Duplicate data not allowed
            return node;
        }

        // Update the height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        return node;
    }
}

public class AVLTrees {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Node root = null;

        // Insert nodes into the tree
        root = tree.insert(root, 10);
        root = tree.insert(root, 20);
        root = tree.insert(root, 30);
        root = tree.insert(root, 40);
        root = tree.insert(root, 50);
        root = tree.insert(root, 25);

        // Print the tree's in-order traversal
        System.out.print("In-order traversal: ");
        tree.inOrder(root);
        System.out.println();

        // Print the heights of the left and right subtrees of the root
        tree.printSubtreeHeights(root);

        // Print unbalanced nodes in the tree
        tree.printUnbalancedNodes(root);

        // Check if the tree is balanced
        System.out.println("Is the tree balanced? " + tree.isBalanced(root));
    }
}
