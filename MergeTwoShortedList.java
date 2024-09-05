import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoShortedList {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,4);
        List<Integer> list2= Arrays.asList(1,3,4);
        List<Integer> result = Stream.concat(list1.stream(),list2.stream()).sorted().collect(Collectors.toList());
        System.out.println(result);

    }
}
