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
    private Node insertData(Node root, int data) {
        // 1. Tree is not available
        if(root == null) root = new Node(data);
        // 2. Tree is available
        else if(root.data > data) root.left = insertData(root.left, data);
        else if(root.data < data) root.right = insertData(root.right, data);
        return root;
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
        bst.inOrder();                      // 4 9 17 20 23 30 32 77 92
        // NOTE :- First output of preOrder prints the root
        bst.preOrder();                     // 30 20 9 4 17 23 32 77 92
        // NOTE :- Last output of preOrder prints the root
        bst.postOrder();                    // 4 17 9 23 20 92 77 32 30
    }
}
