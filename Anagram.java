import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        String s1= Stream.of(str1.split("")).map(String:: toUpperCase).sorted().collect(Collectors.joining());
        String s2= Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        System.out.println(s1.equals(s2));

    }
}
