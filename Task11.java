package LogicBuilding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Task11 {

	public static void main(String[] args) {
		
		/*int[] a1= {2,7,11,15};
		int target = 13;
		int sum=0;
		boolean temp;
		for(Integer i=0;i<a1.length;i++) {
			for(Integer j=i+1;j<a1.length;j++) {
				sum = a1[i] + a1[j];
				if(sum == target) {
					System.out.println(i + ", "+j);
					temp=true;
					break;
				}			
			}

		}*/
		
		Integer[] array = {2,4,7,1,3};
		Integer target = 10;
		
		Map<Integer, Integer> map = new HashMap<>();
		Integer[] newArray = IntStream.range(0, array.length).filter(index -> {
			
			if(map.containsKey(array[index])) {
				return true;
			}
			else {
				map.put(target-array[index], index);
				return false;
			}			
		}).mapToObj(index -> new Integer[] {map.get(array[index]), index})
		  .findFirst().orElse(new Integer[2]);
		
		System.out.println(Arrays.toString(newArray));
		
	}

	
}
