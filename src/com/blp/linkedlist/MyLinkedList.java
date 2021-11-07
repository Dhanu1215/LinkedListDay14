package com.blp.linkedlist;

public class MyLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addNode(56);
        list.addNode(70);
        list.addingNode(30);
        list.display();
        list.popLast();
        list.display();
        list.search(30);

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

    //Checks if the list is empty
    public void popLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            //Checks whether the list contains only one element
            if (head != tail) {
                Node current = head;
                //Loop through the list till the second last element such that current.next is pointing to tail
                while (current.next != tail) {
                    current = current.next;
                }
                //Second last element will become new tail of the list
                tail = current;
                tail.next = null;
            }
            //If the list contains only one element
            //Then it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
        }
    }

    public int search(int data) {
        //Create a new node
        Node newNode = new Node(data);
        Node current = head;
        if (head == null) {
            tail = null;
        } else
            while (true) {
                if (current == newNode) {
                    current.next = tail;
                }
            }
        return data;
    }
    // Display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }
}
