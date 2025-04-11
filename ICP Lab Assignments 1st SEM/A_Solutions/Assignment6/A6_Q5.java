import java.util.Scanner;
public class A6_Q5 {
    public static double area(int n,double s){
        return (n*s*s)/(4*Math.tan(Math.PI/n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");    
        int n = sc.nextInt();
        System.out.print("Enter the side length: ");
        double s = sc.nextDouble();
        if(n<3 || s<0) System.out.println("The polygon is not possible.");
        else System.out.println("The area of the polygon is: "+area(n,s));
    }
}
