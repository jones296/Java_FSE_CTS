import java.util.Scanner;
public class ex_9_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        char grade = marks >= 90 ? 'A' :
                    marks >= 80 ? 'B' :
                    marks >= 70 ? 'C' :
                    marks >= 60 ? 'D' : 'F';
        
        System.out.println("Grade: " + grade);
    }
}
