import java.util.Scanner;

public class A7_Q12 {
    
    // Selection Sort method
    public static void selectionSort(int[] list) {
        int n = list.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if a smaller element is found
            if (minIndex != i) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Call the selection sort method
        selectionSort(numbers);

        // Display the sorted numbers
        System.out.print("The sorted numbers are: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
