import java.util.Scanner;

public class A7_Q10 {
    
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int size = 0;

        for (int num : list) {
            boolean isDuplicate = false;
            for (int j = 0; j < size; j++) {
                if (temp[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[size++] = num; 
            }
        }
        int [] result = new int[size];
        for(int i=0;i<size;i++){
            result[i]=temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int[] distinctNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }
}
