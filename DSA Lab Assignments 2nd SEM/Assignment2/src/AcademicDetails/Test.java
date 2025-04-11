package AcademicDetails;

public class Test extends Student {
    public int mark1,mark2;
    public void inputDetails(int mark1, int mark2){
        this.mark1=mark1;
        this.mark2=mark2;
    }
    public void showDetails(){
        super.showStuDetails();
        System.out.println("Mark1: "+this.mark1);
        System.out.println("Mark2: "+this.mark2);
    }

}
