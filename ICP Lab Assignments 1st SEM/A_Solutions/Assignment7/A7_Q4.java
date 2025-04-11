import java.util.Scanner;
public class A7_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements in the array: ");
        double [] arr = new double[10];
        for (int i = 0; i < 10; i++) arr[i] = sc.nextDouble();
        java.util.Arrays.sort(arr);
        System.out.println("Minimum element is : "+arr[0]);
    }
}
