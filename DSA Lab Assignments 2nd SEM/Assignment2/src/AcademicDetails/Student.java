package AcademicDetails;

public class Student {
    String name;
    int roll;
    public void inputDetails(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    public void showStuDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Roll No.: "+this.roll);
    }
}
