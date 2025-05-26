class ex_18_InheritanceExample {
    void makeSound() { System.out.println("Animal sound"); }
}

class ex18_Dog extends ex18_Animal {
    @Override void makeSound() { System.out.println("Bark"); }
}

public class ex18_InheritanceDemo {
    public static void main(String[] args) {
        ex18_Animal a = new ex18_Animal();
        ex18_Dog d = new ex18_Dog();
        a.makeSound();
        d.makeSound();
    }
}
