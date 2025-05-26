import java.util.ArrayList;
import java.util.Scanner;
public class ex_24_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter name (or 'quit' to stop): ");
            String name = sc.nextLine();
            if(name.equals("quit")) break;
            names.add(name);
        }
        
        System.out.println("Names entered: " + names);
    }
}