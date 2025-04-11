class Shapes{
    String color;
    Shapes(String color){
        this.color=color;
    }
    void display(){}
}
class circle extends Shapes{
    double radius,area;
    circle(String color,double r){
        super(color);
        this.radius=r;
        this.area=this.area();
    }
    double area(){
        return Math.PI*this.radius*this.radius;
    }
    @Override
    void display(){
        System.out.println("Color of Circle: "+this.color+"\t Area: "+this.area);
    }
}
class rectangle extends Shapes{
    double width,length,area;
    rectangle(String color,double w,double l){
        super(color);
        this.width=w;
        this.length=l;
        this.area=this.area();
    }
    double area(){
        return this.length*this.width;
    }
    @Override
    void display(){
        System.out.println("Color of rectangle: "+this.color+"\t Area: "+this.area);
    }
}
public class A2_Q7 {
    public static void main(String[] args) {
        Shapes circle = new circle("Green",10);
        Shapes rectangle = new rectangle("Blue",12,7);
        circle.display();
        rectangle.display();
    }
}
