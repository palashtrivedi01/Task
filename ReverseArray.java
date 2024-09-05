import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer []nums = {1,2,3,4,5,6,7};
        Collections.rotate(Arrays.asList(nums),3);
        System.out.println(Arrays.toString(nums));

    }
}
