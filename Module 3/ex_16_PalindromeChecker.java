import java.util.Scanner;
public class ex_16_PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()) 
            ? "Palindrome" : "Not Palindrome");
    }
}
