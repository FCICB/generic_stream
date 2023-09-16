import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

    String[] cars={"aston","AsTon","passat","golf","jetta","Jetta"};
       System.out.println( Arrays.stream(cars)
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toList()));

    }
}
