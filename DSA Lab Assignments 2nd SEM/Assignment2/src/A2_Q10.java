import AcademicDetails.Test;
import SportsDetails.Sports;

public class A2_Q10 implements Sports{
    public static void main(String[] args) {
        Test s1 = new Test();
        s1.inputDetails("Ankit",36);
        s1.inputDetails(100,111);
        s1.showStuDetails();
        System.out.println("Total Marks = "+(s1.mark1+s1.mark2));
        System.out.println("Total Score = "+(Sports.score1+Sports.score2));
    }
}
