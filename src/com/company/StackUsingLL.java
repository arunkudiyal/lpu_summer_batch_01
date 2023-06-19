package com.company;
public class StackUsingLL {
    static Node top;
    StackUsingLL() {
        this.top = null;
    }
    public static class Node {
        int data;
        Node next;
    }
    // 1. push() --> Inserts an element at the top of the stack
    public void push(int element) {
        Node newNode = new Node();
        if(newNode == null) {
            System.out.println("Stack Overflow!");
            return;
        }
        newNode.data = element;
        newNode.next = top;
        this.top = newNode;
        System.out.println(element + " has been pushed!");
    }
    public void pop() {
        if(top == null) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println(top.data + " has been popped!");
        top = top.next;
    }
    public int peek() {
        if(top == null) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return top.data;
    }
    public void display() {
        if(top == null) {
            System.out.println("Stack Underflow!");
            return;
        }
        Node temp = top;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(100);
        System.out.println("Top most element is : " + stack.peek());
        stack.push(200);
        System.out.println("Top most element is : " + stack.peek());
        stack.push(300);
        System.out.println("Top most element is : " + stack.peek());
        stack.display();                            // 300 200 100
        stack.pop();
        System.out.println("Top most element is : " + stack.peek());
        stack.display();                            // 200 100
    }
}
