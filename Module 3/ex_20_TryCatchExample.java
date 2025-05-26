import java.util.Scanner;
public class ex_20_TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a/b);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch(Exception e) {
            System.out.println("Invalid input");
        }
    }
}
