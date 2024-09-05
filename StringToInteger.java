import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "123";
       int a= Stream.of(str).map(Integer::parseInt).findFirst().orElse(null);
        System.out.print(a);

    }
}
