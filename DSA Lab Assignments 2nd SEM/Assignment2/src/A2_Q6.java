class Vehicle{
    String model;
    int year;
    Vehicle(String model, int year){
        this.model = model;
        this.year = year;
    }
    void carsDisplay(){}
}
class cars extends Vehicle{
    int carid;
    double price;
    cars(String model, int year, int carid, int price) {
        super(model, year);
        this.carid=carid;
        this.price=price;
    }
    @Override
    void carsDisplay(){
        System.out.printf("Model: %s \tId: %d \tYear: %d \tPrice: %.0f\n",model,carid,year,price);
    }
}

public class A2_Q6 {
    public static void main(String[] args) {
        Vehicle car1=new cars("Ferari",2016,2463675,11500000);
        Vehicle car2=new cars("Mercedes",2020,938425,21500000);
        car1.carsDisplay();
        car2.carsDisplay();
    }
}
