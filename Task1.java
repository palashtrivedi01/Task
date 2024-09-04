package LogicBuilding;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {
		String s1 = "Hello World";
//		char[] c1 = s1.toCharArray();
//		String s2="";
//		
//		for(int i=0;i<c1.length;i++) {
//			s2 = s1.charAt(i) + s2;
//		}
//		System.out.println(s2);
		
		System.out.println(reverseStirng(s1));
		
}
	public static String reverseStirng(String string) {
		return Stream.of(string).map(q -> new StringBuilder(q).reverse()).collect(Collectors.joining());
		
	}
}
