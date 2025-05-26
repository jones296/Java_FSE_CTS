import java.util.Scanner;
public class ex_5_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
    }
}
