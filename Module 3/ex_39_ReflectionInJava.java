import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ex_39_ReflectionInJava {

    public static void main(String[] args) {
        String className = "MyClass"; // The name of the class to load
        String methodName = "displayInfo"; // The name of the method to invoke

        try {
            // 1. Load the class using Class.forName()
            Class<?> loadedClass = Class.forName(className);
            System.out.println("Class loaded: " + loadedClass.getName());
            System.out.println("------------------------------------");

            // Create an instance of the loaded class (optional, but needed for non-static methods)
            Object instance = loadedClass.getDeclaredConstructor(String.class, int.class).newInstance("ReflectedObject", 123);

            // 2. Get all declared methods of the class
            Method[] methods = loadedClass.getDeclaredMethods();

            System.out.println("Methods in " + loadedClass.getName() + ":");
            for (Method method : methods) {
                // Print method names and parameters
                System.out.print("  Method Name: " + method.getName());
                System.out.println(", Parameters: " + Arrays.toString(method.getParameterTypes()));
            }
            System.out.println("------------------------------------");

            // 3. Find and invoke a specific method dynamically
            System.out.println("Attempting to invoke method: '" + methodName + "'");

            // To invoke a method with parameters, you need to specify the parameter types
            // For displayInfo(String), the parameter type is String.class
            try {
                Method methodToInvoke = loadedClass.getMethod(methodName, String.class); // Specify parameter types
                System.out.println("  Method found: " + methodToInvoke.getName());

                // Invoke the method
                methodToInvoke.invoke(instance, "Dynamic Call"); // Pass the instance and arguments
                System.out.println("  Method invoked successfully.");
            } catch (NoSuchMethodException e) {
                System.out.println("  Method '" + methodName + "' with specified parameters not found.");
            }

            // Example of invoking a method with no parameters
            System.out.println("\nAttempting to invoke method: 'sayHello'");
            try {
                Method sayHelloMethod = loadedClass.getMethod("sayHello");
                sayHelloMethod.invoke(instance);
            } catch (NoSuchMethodException e) {
                System.out.println("  Method 'sayHello' not found.");
            }

            // Example of invoking a private method (requires setAccessible(true))
            System.out.println("\nAttempting to invoke private method: 'privateMethod'");
            try {
                Method privateMethod = loadedClass.getDeclaredMethod("privateMethod");
                privateMethod.setAccessible(true); // Allow access to private method
                privateMethod.invoke(instance);
            } catch (NoSuchMethodException e) {
                System.out.println("  Private method 'privateMethod' not found.");
            }


        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class '" + className + "' not found.");
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            System.err.println("Error during method invocation or instance creation: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
