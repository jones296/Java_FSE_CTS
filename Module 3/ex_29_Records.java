record ex29_Person(String name, int age) {}

public class ex_29_Records {
    public static void main(String[] args) {
        ex29_Person p = new ex29_Person("Alice", 30);
        System.out.println(p.name() + " is " + p.age() + " years old");
    }
}
