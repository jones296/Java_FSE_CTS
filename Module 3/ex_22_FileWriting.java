import java.io.FileWriter;
import java.util.Scanner;
public class ex_22_FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        try(FileWriter fw = new FileWriter("output.txt")) {
            fw.write(text);
            System.out.println("Data written to file");
        } catch(Exception e) {
            System.out.println("Error writing file");
        }
    }
}
