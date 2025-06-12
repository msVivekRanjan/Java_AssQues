/*
DSA Assignment 5 – Doubly Linked List

Write a menu-driven Java Program using class, methods, and reference variables,
to construct a doubly linked list containing:
- student regd_no (int)
- mark secured in a subject (float)

Operations:
1. Create list
2. Insert (Beginning, End, Any position)
3. Delete (Beginning, End, Any position)
4. Search and update by regd_no
5. Display list (forward)
*/

import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next, prev;

    Node(int r, float m) {
        regd_no = r;
        mark = m;
        next = prev = null;
    }
}
class DLinkedList {

    static Scanner sc = new Scanner(System.in);

    public static Node create(Node Head, Node end) {
        System.out.print("Enter regd_no & mark: ");
        Node newNode = new Node(sc.nextInt(), sc.nextFloat());
        if (Head == null) return newNode;
        end.next = newNode;
        newNode.prev = end;
        return newNode;
    }

    public static void display(Node Head, Node end) {
        if (Head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = Head;
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no + ", Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static Node insBeg(Node Head, Node end) {
        System.out.print("Enter regd_no & mark: ");
        Node newNode = new Node(sc.nextInt(), sc.nextFloat());
        if (Head == null) return newNode;
        newNode.next = Head;
        Head.prev = newNode;
        return newNode;
    }

    public static Node insEnd(Node Head, Node end) {
        System.out.print("Enter regd_no & mark: ");
        Node newNode = new Node(sc.nextInt(), sc.nextFloat());
        if (Head == null) return newNode;
        end.next = newNode;
        newNode.prev = end;
        return newNode;
    }

    public static Node insAny(Node Head, Node end) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        System.out.print("Enter regd_no & mark: ");
        Node newNode = new Node(sc.nextInt(), sc.nextFloat());
        if (pos <= 1 || Head == null) {
            newNode.next = Head;
            if (Head != null) Head.prev = newNode;
            return newNode;
        }
        Node temp = Head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        newNode.next = temp.next;
        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        return Head;
    }

    public static Node delBeg(Node Head, Node end) {
        if (Head == null) return null;
        Head = Head.next;
        if (Head != null) Head.prev = null;
        return Head;
    }

    public static Node delEnd(Node Head, Node end) {
        if (Head == null || Head.next == null) return null;
        Node temp = Head;
        while (temp.next != null) temp = temp.next;
        if (temp.prev != null) temp.prev.next = null;
        return Head;
    }

    public static Node delAny(Node Head, Node end) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (Head == null || pos <= 1) return delBeg(Head, end);
        Node temp = Head;
        for (int i = 1; i < pos && temp != null; i++) temp = temp.next;
        if (temp == null) return Head;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        return Head;
    }

    public static void search(Node Head) {
        System.out.print("Enter regd_no to update: ");
        int key = sc.nextInt();
        Node temp = Head;
        while (temp != null) {
            if (temp.regd_no == key) {
                System.out.print("Enter new mark: ");
                temp.mark = sc.nextFloat();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Node not found");
    }

    public static void main(String[] args) {
        Node Head = null, end = null;

        while (true) {
            System.out.println("\n***** MENU *****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at Beginning");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at Any Position");
            System.out.println("6: Delete from Beginning");
            System.out.println("7: Delete from End");
            System.out.println("8: Delete from Any Position");
            System.out.println("9: Search and Update");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0: System.exit(0);
                case 1:
                    Node node = create(Head, end);
                    if (Head == null) Head = node;
                    else end.next = node;
                    node.prev = end;
                    end = node;
                    break;
                case 2: display(Head, end); break;
                case 3:
                    Head = insBeg(Head, end);
                    if (end == null) end = Head;
                    break;
                case 4:
                    end = insEnd(Head, end);
                    if (Head == null) Head = end;
                    break;
                case 5: Head = insAny(Head, end); break;
                case 6:
                    Head = delBeg(Head, end);
                    if (Head == null) end = null;
                    break;
                case 7:
                    Head = delEnd(Head, end);
                    if (Head == null) end = null;
                    break;
                case 8: Head = delAny(Head, end); break;
                case 9: search(Head); break;
                default: System.out.println("Wrong choice");
            }
        }
    }
}

/*
Sample Output:

***** MENU *****
1: Creation
Enter regd_no & mark: 101 89.5
2: Display
Regd No: 101, Mark: 89.5
4: Insert at End
Enter regd_no & mark: 102 78.0
2: Display
Regd No: 101, Mark: 89.5
Regd No: 102, Mark: 78.0
5: Insert at Any Position
Enter position: 2
Enter regd_no & mark: 103 90.1
2: Display
Regd No: 101, Mark: 89.5
Regd No: 103, Mark: 90.1
Regd No: 102, Mark: 78.0
9: Search and Update
Enter regd_no to update: 102
Enter new mark: 80.0
2: Display
Regd No: 101, Mark: 89.5
Regd No: 103, Mark: 90.1
Regd No: 102, Mark: 80.0
*/
