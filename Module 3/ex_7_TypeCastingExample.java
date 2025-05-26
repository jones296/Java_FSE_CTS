public class ex_7_TypeCastingExample {
    public static void main(String[] args) {
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        
        System.out.println("Double: " + d);
        System.out.println("Long: " + l);
        System.out.println("Int: " + i);
    }
}
