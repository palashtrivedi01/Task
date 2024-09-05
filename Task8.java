package LogicBuilding;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task8 {

	public static void main(String[] args) {

		String s3 = "waterbottle";
		String s4 = "erbottlewatz";

//		boolean result = s3.length() == s4.length() && (s3 + s3).contains(s4);
//		if (result)
//			System.out.println("True");
//		else
//			System.out.println("False");

		char[] c1 = s3.toCharArray();
		char[] c2 = s4.toCharArray();

		Arrays.parallelSort(c1);
		Arrays.parallelSort(c2);
		System.out.println(c1);
		System.out.println(c2);

		if (Arrays.equals(c1, c2))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
