class PointType{
    double x,y;
    PointType(double x,double y){
        this.x=x;
        this.y=y;
    }
    void showPoint(){
        System.out.println("x-coordinate: "+this.x);
        System.out.println("y-coordinate: "+this.y);
    }
    void printCoordinate(){
        System.out.println("The coordinates are: ("+this.return_x()+", "+this.return_y()+")");
    }
    double return_x(){
        return this.x;
    }
    double return_y(){
        return this.y;
    }
}
class CircleType extends PointType{
    double radius;
    CircleType(double x,double y,double r){
        super(x,y);
        this.radius=r;
    }
    void printRadius(){
        System.out.println("Radius of circle: "+this.radius);
    }
    void area(){
        System.out.println("Area of circle: "+(Math.PI*this.radius*this.radius));
    }
}

public class A2_Q15 {
    public static void main(String[] args) {
        CircleType c1=new CircleType(12,34,2);
        c1.showPoint();
        c1.printCoordinate();
        c1.printRadius();
        c1.area();
    }
}
