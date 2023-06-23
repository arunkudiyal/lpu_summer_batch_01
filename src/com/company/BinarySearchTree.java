package com.company;

public class BinarySearchTree {
    Node root;
    BinarySearchTree() {
        this.root = null;
    }
    private static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    // Encapsulated Functions
    public void insert(int data) {
        root = insertData(root, data);
    }
    public void inOrder() {
        inOrderTraversal(root);
        System.out.println();
    }
    public void preOrder() {
        preOrderTraversal(root);
        System.out.println();
    }
    public void postOrder() {
        postOrderTraversal(root);
        System.out.println();
    }
    public boolean search(int key) {
        Node address = searchKey(root, key);
        if(address == null) return false;
        else return true;
    }
    public void delete(int key) {
        root = deleteKey(root, key);
    }
    public int height() {
        return getHeight(root);
    }
    private Node insertData(Node root, int data) {
        // 1. Tree is not available
        if(root == null) root = new Node(data);
        // 2. Tree is available
        else if(root.data > data) root.left = insertData(root.left, data);
        else if(root.data < data) root.right = insertData(root.right, data);
        return root;
    }
    // NOTE -> searchKey returns an address of the node when the data is found
    // & returns null if the data is not found
    private Node searchKey(Node root, int key) {
        if(root == null || key == root.data) return root;
        else if(key < root.data) return searchKey(root.left, key);
        else if(key > root.data) return searchKey(root.right, key);
        return root;
    }
    private int findMin(Node root) {
        int minVal = root.data;
        while(root.left != null) {
            minVal = root.left.data;
            root = root.left;
        }
        return minVal;
    }
    private Node deleteKey(Node root, int key) {
        // Step1 -> Search for the key to be deleted
        if(root == null) return null;
        else {
            if(key < root.data) root.left = deleteKey(root.left, key);
            else if(key > root.data) root.right = deleteKey(root.right, key);
            // key == root.data
            else {
                // Case_1 - Node deleted is a leaf node
                // Case_2 - Node deleted has a left or right subtree.
                if(root.left == null) return root.right;
                else if(root.right == null) return root.left;
                // Case_3 - Node deleted has both left & right subtree.
                else {
                    // Math.min(root.left.data, root.right.data)
                    root.data = findMin(root.right);
                    // root.data = findMax(root.left)
                    root.right = deleteKey(root.right, root.data);
                    // root.left = deleteKey(root.left, root.data);
                }
            }
        }
        return root;
    }
    private int getHeight(Node root) {
        // height of the empty tree will be -1
        if(root == null) return -1;
        else {
            int lHeight = getHeight(root.left);
            int rHeight = getHeight(root.right);
            return Math.max(lHeight, rHeight) + 1;
        }
    }
    private void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);        // L
            System.out.print(root.data + " ");  // D
            inOrderTraversal(root.right);       // R
        }
    }
    private void preOrderTraversal(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");  // D
            preOrderTraversal(root.left);       // L
            preOrderTraversal(root.right);      // R
        }
    }
    private void postOrderTraversal(Node root) {
        if(root != null) {
            postOrderTraversal(root.left);       // L
            postOrderTraversal(root.right);      // R
            System.out.print(root.data + " ");   // D
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();          // root = null;
        bst.insert(30);
        bst.insert(20);
        bst.insert(23);
        bst.insert(32);
        bst.insert(9);
        bst.insert(4);
        bst.insert(77);
        bst.insert(17);
        bst.insert(92);
        // NOTE :- inOrder of any BST is always in the ascending order.
        bst.inOrder();                                                          // 4 9 17 20 23 30 32 77 92
        // NOTE :- First output of preOrder prints the root
        bst.preOrder();                                                         // 30 20 9 4 17 23 32 77 92
        // NOTE :- Last output of postOrder prints the root
        bst.postOrder();                                                        // 4 17 9 23 20 92 77 32 30
        System.out.println(bst.search(77));                                // true
        System.out.println(bst.search(100));                               // false
        bst.delete(30);
        bst.inOrder();                                                          // 4 9 17 20 23 32 77 92
        bst.delete(4);
        bst.inOrder();                                                          // 9 17 20 23 32 77 92
        bst.delete(200);
        bst.inOrder();                                                          // 9 17 20 23 32 77 92
        System.out.println(bst.height());                                       // 3

        // QUESTIONS BASED ON ORDER OF BST :-
        // Q.1 - Given a preOrder of a BST, find the postOrder & inOrder for the BST. (POSSIBLE)
        // Q.2 - Given a postOrder of a BST, find the preOrder & inOrder for the BST. (POSSIBLE)
        // Q.3 - Given a inOrder of a BST, find the preOrder & postOrder for the BST. (NOT POSSIBLE)
    }
}
