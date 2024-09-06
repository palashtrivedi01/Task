package LogicBuilding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Task20 {

	 public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();	//element and uski frequency store krne ke liye Map
        Arrays.stream(nums)
        .forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));  //map se num ka current count get krne ke liye getOrDefault, agar abhi num nahi hai then gives 0 
        return map.entrySet().stream()	//converting map ki entries into stream
        		.sorted(Comparator.comparingInt(entry -> entry.getValue() * -1))  //Comparator to sort entries by unki value in DESCENDING order, -1 to arrange in descending order
                .findFirst()	//comparingInt sort in ascending by default
                .get().getKey();	//to get key of the element with highest frequency
	    }
	
	public static void main(String[] args) {
		int[] a = {3,2,3};
		System.out.println(majorityElement(a));
		
	}
	
}
