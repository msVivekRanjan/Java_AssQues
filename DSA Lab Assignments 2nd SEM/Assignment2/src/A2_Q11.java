class Student{
    int Roll, DSA_Mark;
    static int high=0;
    String name;
    void getdata(String n, int r, int m){
        name = n;
        Roll = r;
        DSA_Mark = m;
        if(m>high) high=m;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+Roll);
        System.out.println("DSA_Mark: "+DSA_Mark);
    }
}

public class A2_Q11 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        s1.getdata("Rahul", 1, 90);
        s2.getdata("Rajiv", 2, 95);
        s3.getdata("Roshan",3, 99);
        s4.getdata("Rounak", 4, 88);
        s5.getdata("Rohit", 5, 97);
        System.out.println("Highest DSA Mark: "+Student.high);
    }
}
