package com.company;

public class QueueUsingLinkedList {
    Node front, rear;
    QueueUsingLinkedList() {
        front = rear = null;
    }
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void enQueue(int data) {
        Node newNode = new Node(data);
        // a.) Queue is empty
        if(front == null) {
            front = rear = newNode;
            System.out.println(data + " has been enQueued!");
        }
        else {
            rear.next = newNode;
            rear = rear.next;
            System.out.println(data + " has been enQueued!");
        }
    }
    public void display() {
        if(front == null) {
            System.out.println("Queue is empty, call enQueue() to insert!");
        } else {
            Node temp = front;
            while(temp != rear) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public int getFront() { return front.data; }
    public int getRear() { return rear.data; }
    public void deQueue() {
        if(front == null) {
            System.out.println("Queue is empty, call enQueue() to insert");
        } else if(front == rear) {
            System.out.println(front.data + " is removed!");
            front = rear = null;
        } else {
            System.out.println(front.data + " is removed!");
            front = front.next;
        }
    }
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();            // front = rear = null;
        queue.enQueue(100);
        queue.enQueue(200);
        queue.enQueue(300);
        queue.enQueue(400);
        queue.display();                                                    // 100 200 300 400
        System.out.println("The front data is - " + queue.getFront());      // 100
        System.out.println("The rear data is - " + queue.getRear());        // 400
        queue.deQueue();                                                    // 200 300 400
        queue.deQueue();                                                    // 300 400
        queue.deQueue();                                                    // 400
        queue.display();                                                    // 400
    }
}
