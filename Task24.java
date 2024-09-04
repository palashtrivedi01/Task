package LogicBuilding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task24 {

	public static void main(String[] args) {
		Integer[] a1 = {1,2,4};
		Integer[] a2 = {1,3,4};
		Integer[] a3 = Stream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(a3));
	}
	
}
