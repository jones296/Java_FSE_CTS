public class ex_37_JavapBytecode {
    public void greet() {
        System.out.println("Hello Bytecode");
    }

    public static void main(String[] args) {
        new ex_37_JavapBytecode().greet();
    }
}
// Compile and then run: javap -c ex_javacode37

