/*
PART-II: Dynamic Queue using Linked List

Write a menu-driven Java program to implement a queue using linked list and perform:
- insert(Node rear, Node front)
- delete(Node rear, Node front)
- display(Node rear, Node front)
*/

import java.util.Scanner;

class Node {
    int info;
    Node next;

    Node(int val) {
        info = val;
        next = null;
    }
}

class QueueDemo2 {

    public static Node insert(Node rear, Node front) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to insert: ");
        int x = sc.nextInt();
        Node newNode = new Node(x);
        if (rear == null) {
            rear = front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        frontRef[0] = front;
        return rear;
    }

    public static Node delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue Underflow");
            return null;
        }
        System.out.println("Deleted: " + front.info);
        front = front.next;
        if (front == null) rearRef[0] = null;
        frontRef[0] = front;
        return rear;
    }

    public static void display(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // We use static wrapper to allow cross updates between front & rear
    static Node[] frontRef = new Node[1];
    static Node[] rearRef = new Node[1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node rear = null, front = null;
        rearRef[0] = rear;
        frontRef[0] = front;

        while (true) {
            System.out.println("\n****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0: System.exit(0);
                case 1: rearRef[0] = insert(rearRef[0], frontRef[0]); break;
                case 2: rearRef[0] = delete(rearRef[0], frontRef[0]); break;
                case 3: display(rearRef[0], frontRef[0]); break;
                default: System.out.println("Wrong choice");
            }
        }
    }
}

/*
Sample Output:

****MENU****
1: Insert
Enter element to insert: 100

1: Insert
Enter element to insert: 200

3: Display
Queue: 100 200

2: Delete
Deleted: 100

3: Display
Queue: 200
*/
