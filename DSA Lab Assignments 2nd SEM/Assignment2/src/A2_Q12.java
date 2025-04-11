class Person{
    String name;
    int age;
    Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
class Employe extends Person{
    int Eid;
    double salary;
    Employe(String name, int age, int Eid, double salary){
        super(name,age);
        this.Eid=Eid;
        this.salary= salary;
    }

    void Empdisplay(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("EmpID: "+this.Eid);
        System.out.println("Salary: "+this.salary);
    }
}
public class A2_Q12{
    public static void main(String[] args) {
        Employe p1=new Employe("Vivek",19,124864,76500);
        p1.Empdisplay();
    }
}