
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks in Physics : ");
        int Physics=sc.nextInt();
        System.out.print("Enter the marks in Chemistry : ");
        int Chemistry=sc.nextInt();
        System.out.print("Enter the marks in Mathematics : ");
        int Mathematics =sc.nextInt();
        System.out.print("Enter the marks in Biology : ");
        int Biology=sc.nextInt();
        System.out.print("Enter the marks in English : ");
        int English=sc.nextInt();
        int TotalMarks=Physics+ Chemistry + Mathematics + Biology + English;
        float Average_Percentage=(float)TotalMarks/5;
        System.out.println("Your Total marks is : "+TotalMarks);
        System.out.println();
        System.out.println("Your Average percentage is : "+Average_Percentage);
        System.out.println();
        if(Average_Percentage >= 90) {
            System.out.println("Your Grade is A");
        }
        else if(Average_Percentage >= 80) {
            System.out.println("Your Grade is B");
        }
        else if(Average_Percentage >= 70) {
            System.out.println("Your Grade is C");
        }
        else if(Average_Percentage >= 60) {
            System.out.println("Your Grade is D");
        }
        else if(Average_Percentage >= 50) {
            System.out.println("Your Grade is E");
        }
        else {
            System.out.println("Your Grade is F");
        }


    }
}               
