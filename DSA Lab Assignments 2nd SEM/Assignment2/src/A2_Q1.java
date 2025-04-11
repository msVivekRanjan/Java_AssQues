import java.util.Scanner;
class Car {
    String name;
    int year;
    void setDetails(String name, int year){
        this.name=name;
        this.year=year;
    }
    void displayDetails(){
        System.out.println("Car name: "+this.name);
        System.out.println("Manufactured in year: "+this.year);
    }
}

public class A2_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car c1=new Car();
        Car c2=new Car();
        c1.name="Toyota";
        c1.year=2018;

        System.out.println("Enter the name of the car: ");
        String name = sc.nextLine();
        System.out.println("Enter the year of the car: ");
        int year=sc.nextInt();

        c2.setDetails(name,year);

        c1.displayDetails();
        c2.displayDetails();

        System.out.println(((c1.year>c2.year)?c1.name:c2.name)+" is newer");
    }
}
