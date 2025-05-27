import java.util.*;

class Node {
    int regd_no;
    float mark;
    Node next;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }
}

class LinkedList {
    static Scanner sc = new Scanner(System.in);

    public static Node create(Node start) {
        System.out.print("Enter Regd No: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) return newNode;
        Node temp = start;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        return start;
    }

    public static Node InsBeg(Node start) {
        System.out.print("Enter Regd No: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        newNode.next = start;
        return newNode;
    }

    public static Node InsEnd(Node start) {
        return create(start);
    }

    public static Node InsAny(Node start) {
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();
        System.out.print("Enter Regd No: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (pos == 1) {
            newNode.next = start;
            return newNode;
        }
        Node temp = start;
        for (int i = 1; i < pos - 1 && temp != null; i++) temp = temp.next;
        if (temp == null) {
            System.out.println("Position out of bounds");
            return start;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return start;
    }

    public static Node DelBeg(Node start) {
        if (start == null) return null;
        return start.next;
    }

    public static Node DelEnd(Node start) {
        if (start == null || start.next == null) return null;
        Node temp = start;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
        return start;
    }

    public static Node DelAny(Node start) {
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();
        if (pos == 1) return start.next;
        Node temp = start;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        if (temp.next == null) {
            System.out.println("Position out of bounds");
            return start;
        }
        temp.next = temp.next.next;
        return start;
    }

    public static Node DelByRegdNo(Node start) {
        System.out.print("Enter Regd No to delete: ");
        int regd_no = sc.nextInt();
        if (start == null) return null;
        if (start.regd_no == regd_no) return start.next;
        Node temp = start;
        while (temp.next != null && temp.next.regd_no != regd_no) temp = temp.next;
        if (temp.next == null) System.out.println("Node not found.");
        else temp.next = temp.next.next;
        return start;
    }

    public static void search(Node start) {
        System.out.print("Enter Regd No to search: ");
        int regd_no = sc.nextInt();
        Node temp = start;
        while (temp != null) {
            if (temp.regd_no == regd_no) {
                System.out.print("Enter new Mark: ");
                temp.mark = sc.nextFloat();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Node not found.");
    }

    public static void sort(Node start) {
        for (Node i = start; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.mark < j.mark) {
                    float tempMark = i.mark;
                    int tempRegd = i.regd_no;
                    i.mark = j.mark;
                    i.regd_no = j.regd_no;
                    j.mark = tempMark;
                    j.regd_no = tempRegd;
                }
            }
        }
    }

    public static int count(Node start) {
        int cnt = 0;
        Node temp = start;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static Node reverse(Node start) {
        Node prev = null, curr = start;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void display(Node start) {
        Node temp = start;
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no + ", Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node start = null;
        while (true) {
            System.out.println("\n****MENU****");
            System.out.println("0: Exit\n1: Create\n2: Display\n3: Insert at Beginning\n4: Insert at End\n5: Insert at Position\n6: Delete at Beginning\n7: Delete at End\n8: Delete at Position\n9: Delete by Regd No\n10: Search & Update\n11: Sort\n12: Count\n13: Reverse");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0: System.exit(0);
                case 1: start = create(start); break;
                case 2: display(start); break;
                case 3: start = InsBeg(start); break;
                case 4: start = InsEnd(start); break;
                case 5: start = InsAny(start); break;
                case 6: start = DelBeg(start); break;
                case 7: start = DelEnd(start); break;
                case 8: start = DelAny(start); break;
                case 9: start = DelByRegdNo(start); break;
                case 10: search(start); break;
                case 11: sort(start); break;
                case 12: System.out.println("Count: " + count(start)); break;
                case 13: start = reverse(start); break;
                default: System.out.println("Invalid choice");
            }
        }
    }
}
