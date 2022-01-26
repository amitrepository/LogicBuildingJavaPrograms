package Exception.tricky;
import java.util.Arrays;

public class MyProgram {
    public static void main(String[] args) {
        String [][] data = {{},{"Present"}};

        System.out.println(Arrays.stream(data).flatMap(d-> Arrays.stream(d)).findAny().orElse("Nothing"));
        System.out.println(Arrays.stream(data).flatMap(d-> Arrays.stream(d)).findFirst().orElse("Nothing"));
    }
}