package com.company;
public class LinkedList {
    static Node head;
    static class Node {
        // 1. data related to the Node
        int data;
        // 2. reference of the next element
        Node next;
        // 3. constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Constructor of class LinkedList
    LinkedList() {
        this.head = null;
    }
    // A utility method to insert the data at the end of the LinkedList
    public void insertAtEnd(int data) {
        // 1. create a Node for insertion
        Node newNode = new Node(data);
        if(head == null) {                  // LL is empty
            head = newNode;
        } else {                            // LL was not empty
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }
    public void insertAtBeg(int data) {
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }
    public void insertAfter(int data1, int data2) {
        Node temp = head;
        while(temp.data != data1) {
            // a. data1 does not exist
            temp = temp.next;
            if (temp == null) {
                System.out.println(data1 + " does not exist");
                break;
            }
        }
        // b. data1 exists
        if(temp != null) {
            Node newNode = new Node(data2);
            Node temp2 = temp.next;
            temp.next = newNode;
            newNode.next = temp2;
        }
    }
    // A utility method to delete an element at the end of the LinkedList
    public void deleteFromEnd() {
        if(head == null) System.out.println("LinkedList is empty, call insertAtEnd() to insert!");
        else {
            Node temp = head;
            while(temp.next.next != null) temp = temp.next;
            temp.next = null;
        }
    }
    // A utility method to delete an element from the start of the LinkedList
    public void deleteFromStart() {
        if(head == null) System.out.println("LinkedList is empty, call insertAtEnd() to insert!");
        else head = head.next;
    }
    // A utility method to display the elements of the LinkedList
    public void display() {
        if(head == null) {
            System.out.println("List is empty. Call insert() to add values!");
        } else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();             // head = null | denoting that no new Node was created yet.
        list.display();
        list.deleteFromEnd();
        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtEnd(300);
        list.insertAtEnd(400);
        list.insertAtEnd(500);
        list.display();                                 // 100 200 300 400 500
        list.insertAfter(200, 50);
        list.display();                                 // 100 200 300 50 400 500
        list.insertAtBeg(10);
        list.display();                                 // 10 100 200 300 50 400 500
        list.deleteFromEnd();
        list.display();                                 // 10 100 200 300 50 400
        list.deleteFromStart();
        list.display();                                 // 100 200 300 50 400
    }
}
