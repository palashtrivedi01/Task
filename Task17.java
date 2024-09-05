package LogicBuilding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task17 {

	public static void main(String[] args) {
		
		//To print only unique elements -
//		int[] a = { 4,3,2,7,8,2,3,1};
//		Arrays.stream(a).distinct().forEach(System.out::print);

		//To print only duplicate elements
		List<Integer> list = Arrays.asList(4,3,2,7,8,2,3,1);
		list.stream().filter(i -> Collections.frequency(list, i) >1)
        .collect(Collectors.toSet()).forEach(System.out::println);
		
 	} 
}
