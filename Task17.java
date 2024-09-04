package LogicBuilding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task17 {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5, 6 };
		Arrays.stream(a).distinct().forEach(System.out::print);

	}
}
