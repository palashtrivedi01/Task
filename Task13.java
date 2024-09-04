package LogicBuilding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task13 {

	public static void main(String[] args) {
		
		int[] num = {3,0,2,8,4,5,7,6};	
//		System.out.println( "BS : " + Arrays.binarySearch(num, 0, num.length, 6));
		Integer length=num.length;
		Integer actualSum = (length*(length+1))/2; 
		Integer sum =Arrays.stream(num).sum();
		
		Integer miss=actualSum-sum;
		System.out.println(miss);
		
		
	
	}
}
