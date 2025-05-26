import java.util.Scanner;
public class ex_15_StringReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Reversed: " + new StringBuilder(str).reverse());
    }
}
