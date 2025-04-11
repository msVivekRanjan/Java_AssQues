import java.util.Scanner;

public class A7_Q11 {
    
    public static void bubbleSort(double[] list) {
        int n = list.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (list[j] > list[j + 1]) { // Swap if elements are in wrong order
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swapping occurred in this pass, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }
        scanner.close();

        // Call the bubble sort method
        bubbleSort(numbers);

        // Display the sorted numbers
        System.out.print("The sorted numbers are: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
}
