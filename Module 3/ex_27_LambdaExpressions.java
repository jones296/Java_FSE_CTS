import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ex_27_LambdaExpressions {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        Collections.sort(names, (a,b) -> a.compareTo(b));
        System.out.println(names);
    }
}
