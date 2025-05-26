class ex21_InvalidAgeException extends Exception {
    ex21_InvalidAgeException(String msg) { super(msg); }
}

public class ex_21_CustomException {
    static void validateAge(int age) throws ex21_InvalidAgeException {
        if(age < 18) throw new ex21_InvalidAgeException("Age must be ≥18");
    }
    
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch(ex_21_InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}