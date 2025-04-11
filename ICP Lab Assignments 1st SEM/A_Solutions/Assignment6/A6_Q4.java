import java.util.Scanner;
public class A6_Q4 {
    public static int numberOfDaysInAYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) return 366;
        else return 365;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if( year>=2000 && year <= 2020) System.out.println("Number of days in the year " + year + " is " + numberOfDaysInAYear(year));
        else System.out.println("Invalid. Enter a year from 2000 to 2020.");
        sc.close();
    }
}
