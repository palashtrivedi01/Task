//8. String Rotation
//- Input: `"waterbottle", "erbottlewat"`
//        - Output: `true`

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "WAterbottle";
        String str2 = "erbottlewat";
        List<String> collect = Stream.of(str1.split("")).sorted().toList();
        List<String> list = Stream.of(str2.split("")).sorted().toList();
        System.out.println(list.equals(collect));
        System.out.println(collect);



    }
}
