package LogicBuilding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tash12 {

	public static void main(String[] args) {
		
		List<Integer> i = Arrays.asList(11,42,93,54,55,96,72);
		Collections.rotate(i, 4);
		System.out.println(i);
		
	}
	
}
