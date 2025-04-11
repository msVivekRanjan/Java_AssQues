import java.util.Scanner;
class complex {
    int real, imag;
    Scanner sc=new Scanner(System.in);
    void setData(int r,int i){
        this.real=r;
        this.imag=i;
    }
    void display(){
        System.out.println(this.real+"+"+this.imag+"i");
    }
    public complex add(complex x, complex y){
        complex num=new complex();
        this.real = x.real + y.real;
        this.imag = x.imag + y.imag;
        return num;
    }
    public static void main(String[] args) {
         complex c1=new complex();
         complex c2=new complex();
         c1.setData(2,5);
         c2.setData(3,7);
         complex sum=new complex();
         sum.add(c1, c2);
         sum.display();
    }
}
