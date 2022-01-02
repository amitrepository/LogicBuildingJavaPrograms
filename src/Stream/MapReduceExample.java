package Stream;
import java.util.Arrays;
public class MapReduceExample {

    public static void main(String args []){
        String[] myArray = { "this", "is", "a", "sentence" };
        Arrays.stream(myArray).toString();
        String result = Arrays.stream(myArray)
                .reduce("", (a,b) -> a + b);
        System.out.println(result);


    }
}
