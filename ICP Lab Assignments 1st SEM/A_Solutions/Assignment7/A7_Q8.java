import java.util.Scanner;

public class A7_Q8 {
    private int[] array;
    private int size;

    public void createArray(int n) {
        array = new int[n];
        size = n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array created successfully.");
    }

    public void displayArray() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void insertElement(int element, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position! Position should be between 0 and " + size);
            return;
        }

        int[] newArray = new int[size + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        
        newArray[position] = element;
        for (int i = position; i < size; i++) {
            newArray[i + 1] = array[i];
        }

        array = newArray;
        size++;
        System.out.println("Element inserted successfully.");
    }

    public void deleteElement(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position! Position should be between 0 and " + (size - 1));
            return;
        }

        for (int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        System.out.println("Element deleted successfully.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A7_Q8 ao = new A7_Q8();
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Create an array");
            System.out.println("2. Display array elements");
            System.out.println("3. Insert an element at a specific position");
            System.out.println("4. Delete an element at a given position");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    int n = scanner.nextInt();
                    ao.createArray(n);
                    break;
                case 2:
                    ao.displayArray();
                    break;
                case 3:
                    System.out.print("Enter element to insert: ");
                    int element = scanner.nextInt();
                    System.out.print("Enter position (0-based index): ");
                    int position = scanner.nextInt();
                    ao.insertElement(element, position);
                    break;
                case 4:
                    System.out.print("Enter position to delete (0-based index): ");
                    int deletePos = scanner.nextInt();
                    ao.deleteElement(deletePos);
                    break;
                case 5:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

