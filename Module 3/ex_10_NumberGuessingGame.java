import java.util.Scanner;
import java.util.Random;
public class ex_10_NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;
        
        do {
            System.out.print("Guess (1-100): ");
            guess = sc.nextInt();
            if(guess < secret) System.out.println("Too low!");
            else if(guess > secret) System.out.println("Too high!");
        } while(guess != secret);
        
        System.out.println("Correct! The number was " + secret);
    }
}
