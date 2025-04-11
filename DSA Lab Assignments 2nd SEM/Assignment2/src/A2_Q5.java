abstract class Shape {
    abstract void display();
}
class Square extends Shape{
    double side;
    double area;
    Square(double side){
        this.side=side;
        area=area();
    }
    double area(){
        return this.side*this.side;
    }
    @Override
    void display(){
        System.out.println("Area of Square is "+area);
    }
}
class Triangle extends Shape{
    double base,height, area;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
        area=area();
    }
    double area(){
        return 0.5*this.base*this.height;
    }
    @Override
    void display(){
        System.out.println("Area of triangle is "+area);
    }
}
class Circle extends Shape{
    private double radius;
    double area;
    Circle(double r){
        this.radius=r;
        area=area();
    }
    double area(){
        return Math.PI*this.radius*this.radius;
    }
    @Override
    void display(){
        System.out.printf("Area of Circle is %.4f",area);
    }
}
public class A2_Q5{
    public static void main(String[] args) {
        Shape s1=new Square(5);
        Shape s2=new Triangle(5,2);
        Shape s3=new Circle(3);
        s1.display();
        s2.display();
        s3.display();
    }
}
