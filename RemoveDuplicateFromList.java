import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,2,2,3,3);
        Set<Integer> set = new HashSet<>();
        Set<Integer>s1=list.stream().filter(set::add).collect(Collectors.toSet());
        System.out.println(s1);
        //other way
//        List<Integer> l1=list.stream().distinct().sorted().collect(Collectors.toList());
//        System.out.println(l1);
    }
}
