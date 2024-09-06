import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindMissingNumber {
    public static void main(String[] args) {
        {
            List<Integer> lis = Arrays.asList(2, 3, 4, 5, 6, 7);

            int val = IntStream.rangeClosed(1, 7).reduce(0, Integer::sum);
            int acutualSum = lis.stream().reduce(0, Integer::sum);

            int ans = val - acutualSum;
            System.out.println(ans);
        }

    }
}
