package LogicBuilding;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5 {

	public static void main(String[] args) {
		String str = "rtcode";
		char[] ch = str.toCharArray();
		
		Map<Character, Long> in = str.chars()
								 .mapToObj(i -> (char)i)
								 .collect(Collectors.groupingBy(Function.identity(), 
										 LinkedHashMap::new, Collectors.counting()));
	
		Optional<Character> firstNonRepeat = in.entrySet().stream().filter( (e) -> e.getValue() ==1)
												.map(e -> e.getKey()).findFirst();
		
		Optional<Character> firstRepeating = in.entrySet().stream().filter( (e) -> e.getValue() > 1)
												.map(e -> e.getKey()).findFirst();
		 
		if(firstNonRepeat.isEmpty()) 
			System.out.println("Every element is repeating");
		else if(firstNonRepeat.isPresent()) {
			System.out.println("first non-repeating : " + firstNonRepeat.get());
		}
		
		if(firstRepeating.isPresent())
			System.out.println("First repeating : " + firstRepeating.get());
		else if(firstRepeating.isEmpty())
			System.out.println("Every element occuring once so none repeating");
		
	}
}
