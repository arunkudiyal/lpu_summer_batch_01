package com.company;

public class BinaryTree {
    static Node root;
    BinaryTree() {
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
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();            // root = null;
        bTree.root = new Node(100);
        bTree.root.left = new Node(200);
        bTree.root.right = new Node(300);
        bTree.root.left.left = new Node(400);
        bTree.root.left.right = new Node(500);
    }
}
