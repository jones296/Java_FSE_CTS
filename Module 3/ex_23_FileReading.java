import java.io.FileReader;
public class ex_23_FileReading {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("output.txt")) {
            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch(Exception e) {
            System.out.println("Error reading file");
        }
    }
}
