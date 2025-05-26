import java.util.HashMap;
import java.util.Scanner;
public class ex_25_HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter ID (or -1 to stop): ");
            int id = sc.nextInt();
            if(id == -1) break;
            sc.nextLine(); // consume newline
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            map.put(id, name);
        }
        
        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        System.out.println("Name: " + map.get(searchId));
    }
}