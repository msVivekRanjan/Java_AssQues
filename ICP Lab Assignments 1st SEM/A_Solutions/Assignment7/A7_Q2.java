import java.util.Scanner;

public class A7_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] occurrences = new int[101]; // Array to store occurrences of numbers from 1 to 100

        System.out.print("Enter the integers between 1 and 100: ");
        
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break; // Stop when 0 is entered
            if (num >= 1 && num <= 100) {
                occurrences[num]++;
            }
        }
        scanner.close();
        for(int i=0;i<101;i++) System.out.println(occurrences[i]);


        for (int i = 1; i <= 100; i++) {
            if (occurrences[i] > 0) {
                System.out.println(i + " occurs " + occurrences[i] + (occurrences[i] > 1 ? " times" : " time"));
            }
        }
    }
}
