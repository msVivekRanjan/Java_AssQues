class employee {
    String name;
    double salary;
    employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    void displayEmployeeInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
    }

}
class Manager extends employee {
    String dept;
    Manager(String name,String dept,double sal){
        super(name,sal);
        this.dept=dept;
    }
    public void displayManagerDetails(){
        this.displayEmployeeInfo();
        System.out.println("Department: "+this.dept);
    }
}

public class A2_Q9 {
    public static void main(String[] args) {
        Manager p1 = new Manager("Vivek","HR",124900);
        p1.displayManagerDetails();
    }
}
