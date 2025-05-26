import java.util.Scanner;
public class ex_11_FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i=1; i<=n; i++) fact *= i;
        System.out.println(n + "! = " + fact);
    }
}
