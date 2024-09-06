package LogicBuilding;

import java.util.Arrays;

public class Task16 {

public static void main(String[] args) {
	int[] a = {1,2,3,4};
	int[] products = Arrays.stream(a)	//array 'a' ke elements ko iterate krne ke liye stream
            .map(s -> Arrays.stream(a)
            		.filter(x -> x != s)	//jab element not equal to self
            		.reduce(1, (x, y) -> x * y))	//element ka other elements se product 
            .toArray();	//and then, waapas array me convert
	
	Arrays.stream(products).forEach(System.out::println);
}
	
}
