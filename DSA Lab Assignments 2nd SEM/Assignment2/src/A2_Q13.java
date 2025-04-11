class Bank{
    String BankName;
    double depositAmount;
    static double mindeposit=-1,total;
    Bank(String name,double amount){
        this.setAmount(amount);
        this.setBankName(name);

    }
    void setBankName(String name){
        this.BankName=name;
    }
    void setAmount(double amount){
        if(amount>1000){
            this.depositAmount=amount;
            total+=this.depositAmount;
            if(depositAmount<mindeposit){
                mindeposit=depositAmount;
            }
        }
        else{
            System.out.println("Minimum amount not reached.");
        }


    }
    void showData(){
        System.out.println("Bank name: "+this.BankName);
        System.out.println("Deposit amount: "+this.depositAmount);
        System.out.println("Total deposit amount in all banks: "+total);
    }
    void minDeposit(){
        System.out.println("Minimum deposit= "+mindeposit);
    }
}

public class A2_Q13 {
    public static void main(String[] args) {
        Bank b1=new Bank("BOI",130);
        Bank b2=new Bank("SBI",3299990);
        b1.showData();
    }
}
