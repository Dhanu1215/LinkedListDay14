package com.blp.linkedlist;

public class MyLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addNode(56);
        list.addNode(70);
        list.addingNode(30);
        list.display();
        list.pop_front();
        list.display();
    }

    public int size;
    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;


    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
        //Size will count the number of nodes present in the list
        size++;
    }

    //This function will add the new node at the middle of the list.

    private void addingNode(int data) {

        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail would point to new node
            head = newNode;
            tail = newNode;
        } else {
            Node temp, current;
            //Store the mid-position of the list
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            //Node temp will point to head
            temp = head;
            current = null;

            //Traverse through the list till the middle of the list is reached
            for (int i = 0; i < count; i++) {
                //Node current will point to temp
                current = temp;
                //Node temp will point to node next to it.
                temp = temp.next;
            }

            //current will point to new node
            if (current != null) {
                current.next = newNode;
            }
            //new node will point to temp
            newNode.next = temp;
        }
        size++;
    }
    //Delete first node of the list
    void pop_front() {
        if(this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            temp = null;
        }
    }

    // Display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node temp;
        temp = this.head;
        if(temp != null) {
            System.out.print("The list contains: ");
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
    }
}
