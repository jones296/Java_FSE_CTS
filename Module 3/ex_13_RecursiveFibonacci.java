import java.util.Scanner;
public class ex_13_RecursiveFibonacci {
    static int fib(int n) {
        return n <= 1 ? n : fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }
}
