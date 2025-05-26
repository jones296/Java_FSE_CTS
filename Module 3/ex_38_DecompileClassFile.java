public class ex_38_DecompileClassFile {

    private String message;
    private int number;

    public MySimpleProgram() {
        this("Hello from MySimpleProgram!", 100);
    }

    public MySimpleProgram(String msg, int num) {
        this.message = msg;
        this.number = num;
    }

    public void printDetails() {
        System.out.println("Message: " + message);
        System.out.println("Number: " + number);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MySimpleProgram program = new MySimpleProgram();
        program.printDetails();

        MySimpleProgram anotherProgram = new MySimpleProgram("Greetings!", 200);
        anotherProgram.printDetails();

        int sum = add(5, 7);
        System.out.println("Sum: " + sum);
    }
}