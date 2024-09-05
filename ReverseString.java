import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str="Hello World";
        Stream.of(str).map(e-> new StringBuilder(e).reverse().toString()).forEach(System.out::println);
    }

}
