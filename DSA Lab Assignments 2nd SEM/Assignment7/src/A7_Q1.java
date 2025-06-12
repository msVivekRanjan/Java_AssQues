/*
PART-I: Static Queue using Array

Write a menu-driven Java program to implement a queue using array and perform:
- insert(int Q[])
- delete(int Q[])
- display(int Q[])
- is_full()
- is_empty()
*/

import java.util.Scanner;

class QueueDemo1 {

    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;

    public static void insert(int Q[]) {
        Scanner sc = new Scanner(System.in);
        if (is_full()) {
            System.out.println("Queue Overflow");
            return;
        }
        System.out.print("Enter element to insert: ");
        int x = sc.nextInt();
        if (front == -1) front = 0;
        Q[++rear] = x;
    }

    public static void delete(int Q[]) {
        if (is_empty()) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Deleted: " + Q[front]);
        if (front == rear) front = rear = -1;
        else front++;
    }

    public static void display(int Q[]) {
        if (is_empty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(Q[i] + " ");
        }
        System.out.println();
    }

    public static boolean is_full() {
        return rear == MAX - 1;
    }

    public static boolean is_empty() {
        return front == -1 || front > rear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queue[] = new int[MAX];

        while (true) {
            System.out.println("\n***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0: System.exit(0);
                case 1: insert(queue); break;
                case 2: delete(queue); break;
                case 3: display(queue); break;
                default: System.out.println("Invalid choice");
            }
        }
    }
}

/*
Sample Output:

***MENU***
1: Insert
Enter element to insert: 10

1: Insert
Enter element to insert: 20

3: Display
Queue: 10 20

2: Delete
Deleted: 10

3: Display
Queue: 20
*/
