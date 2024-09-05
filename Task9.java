package LogicBuilding;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task9 {

	public static void main(String[] args) {
		String s = "42";
		
		/*char[] charArray = s.toCharArray();
		Integer i = Integer.parseInt(s);
		System.out.println(i);*/
		
		int o = Stream.of(s)
						  .map(Integer::parseInt)
						  .findFirst()
						  .orElse(null);
		System.out.println(o);
	
		
	}
	
}
