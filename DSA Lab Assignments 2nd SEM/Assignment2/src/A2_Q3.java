class Book{
    int bookid,qty;
    double price;
    static double totalamount;
    Book(int id,int qty,double price){
        this.bookid=id;
        this.price=price;
        this.qty=qty;
        totalamount+=this.price*this.qty;
    }
    void displayDetails(){
        System.out.println("BookID: "+this.bookid+"\tQuantity: "+this.qty+"\tPrice: "+this.price);
    }
    static double totalcost(){
        return totalamount;
    }
}
public class A2_Q3 {
    public static void main(String[] args) {
        Book b1=new Book(134523,2,399.02);
        Book b2=new Book(345345,4,249.00);
        Book b3=new Book(754059,3,199.50);
        Book b4=new Book(387462,1,209.82);
        Book b5=new Book(563743,7,55.50);

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        b4.displayDetails();
        b5.displayDetails();

        System.out.println("\nTotal bill: Rs. "+Book.totalcost());
    }

}
