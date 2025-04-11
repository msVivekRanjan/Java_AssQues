class Distance {
    int feet, inches;
    Distance(int feet,int inches){
        this.feet=feet;
        this.inches=inches;
    }
    void displayDistance(){
        System.out.println(this.feet+" feet "+this.inches+" inches");
    }
}
class Measurement extends Distance{
    double cm;
    Measurement(double cm, int feet,int inches){
        super(feet, inches);
        this.cm=cm;
    }
    void displayDistance(){
        super.displayDistance();
        System.out.println(this.cm+" cm");
    }
}
public class A2_Q14{
    public static void main(String[] args) {
        Distance d1=new Measurement(174,12,34);
        d1.displayDistance();
    }
}
