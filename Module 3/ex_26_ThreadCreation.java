public class ex_26_ThreadCreation {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=0; i<5; i++) System.out.println("Thread 1");
        });
        
        Thread t2 = new Thread(() -> {
            for(int i=0; i<5; i++) System.out.println("Thread 2");
        });
        
        t1.start();
        t2.start();
    }
}
