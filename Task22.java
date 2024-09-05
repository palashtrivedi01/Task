package LogicBuilding;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class Task22 {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		list.add(21);
		list.add(25);
		list.add(73);
		list.add(14);
		list.add(50);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
	}
	
}
