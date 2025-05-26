import java.util.Scanner;
public class ex_4_LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        boolean isLeap = (year%400==0) || (year%4==0 && year%100!=0);
        System.out.println(year + (isLeap ? " is" : " is not") + " a leap year");
    }
}