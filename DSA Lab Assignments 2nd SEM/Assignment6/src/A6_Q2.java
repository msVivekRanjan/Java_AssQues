
/*
PART-II: Dynamic Stack Implementation using Linked List

Write a menu-driven Java program to implement a stack using linked list with the following operations:
- push(Node top)
- pop(Node top)
- display(Node top)
*/

import java.util.Scanner;

class Node {
    int info;
    Node next;

    Node(int info) {
        this.info = info;
        this.next = null;
    }
}

class StackDemo2 {

    public static Node push(Node top) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to push: ");
        int val = sc.nextInt();
        Node newNode = new Node(val);
        newNode.next = top;
        return newNode;
    }

    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack Underflow");
            return null;
        }
        System.out.println("Popped: " + top.info);
        return top.next;
    }

    public static void display(Node top) {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;

        while (true) {
            System.out.println("\n****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0: System.exit(0);
                case 1: top = push(top); break;
                case 2: top = pop(top); break;
                case 3: display(top); break;
                default: System.out.println("Wrong choice");
            }
        }
    }
}

/*
Sample Output:

****MENU****
1: Push
Enter element to push: 50

1: Push
Enter element to push: 30

3: Display
Stack: 30 50

2: Pop
Popped: 30

3: Display
Stack: 50
*/

