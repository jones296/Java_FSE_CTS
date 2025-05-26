public class ex17_CarClassAndObjectCreation {
    String make, model;
    int year;
    
    void displayDetails() {
        System.out.println("Make: " + make + "\nModel: " + model + "\nYear: " + year);
    }
    
    public static void main(String[] args) {
        ex17_CarClass car = new ex17_CarClass();
        car.make = "Toyota";
        car.model = "Camry";
        car.year = 2020;
        car.displayDetails();
    }
}