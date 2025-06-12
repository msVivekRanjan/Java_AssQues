/*
PART-I: Static Stack Implementation using Array

Write a menu-driven Java program to implement a stack using an array with the following operations:
- push(int S[], int top)
- pop(int S[], int top)
- display(int S[], int top)
- isEmpty(int top)
- isFull(int top)
*/

import java.util.Scanner;

class StackDemo1 {

    public static final int MAX = 10;

    public static int push(int S[], int top) {
        Scanner sc = new Scanner(System.in);
        if (isFull(top)) {
            System.out.println("Stack Overflow");
            return top;
        }
        System.out.print("Enter element to push: ");
        int x = sc.nextInt();
        S[++top] = x;
        return top;
    }

    public static int pop(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack Underflow");
            return top;
        }
        System.out.println("Popped: " + S[top--]);
        return top;
    }

    public static void display(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(S[i] + " ");
        }
        System.out.println();
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top == MAX - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stack[] = new int[MAX];
        int top = -1;

        while (true) {
            System.out.println("\n***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0: System.exit(0);
                case 1: top = push(stack, top); break;
                case 2: top = pop(stack, top); break;
                case 3: display(stack, top); break;
                default: System.out.println("Invalid choice");
            }
        }
    }
}

/*
Sample Output:

***MENU***
1: Push
Enter element to push: 10

1: Push
Enter element to push: 20

3: Display
Stack: 20 10

2: Pop
Popped: 20

3: Display
Stack: 10
*/
