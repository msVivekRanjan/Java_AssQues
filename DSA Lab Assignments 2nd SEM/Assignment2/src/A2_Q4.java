class Deposit{
    long principal;
    int time;
    double rate, total_amt;
    Deposit(){
        this.principal =12500;
        this.time=10;
        this.rate=12;
    }
    Deposit(long p,int t,double r){
        this.principal =p;
        this.time=t;
        this.rate=r;
    }
    Deposit(long p,int t){
        this.principal =p;
        this.time=t;
        this.rate=10;
    }
    Deposit(long p,double r){
        this.principal =p;
        this.rate=r;
        this.time=10;
    }
    void display(){
        System.out.println("Amount Rs. "+this.principal +" was kept for "+this.time+" years at "+this.rate+"% rate");
    }
    void calc_amt(){
        System.out.println("Total amount is Rs. "+(this.principal+(this.principal*this.rate*this.time)/100));
    }
}

public class A2_Q4 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit();
        Deposit d2 = new Deposit(10000,5,4.7);
        Deposit d3 = new Deposit(9000,7);
        Deposit d4 = new Deposit(5000,19.9);

        d1.display();
        d2.display();
        d3.display();
        d4.display();

        d1.calc_amt();
        d2.calc_amt();
        d3.calc_amt();
        d4.calc_amt();
    }
}
