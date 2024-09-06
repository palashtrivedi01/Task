package LogicBuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task6 {

	public static void permutations(String s, String p) {
	
//		System.out.println("initially : " + s + ", " + p);
		if(s.isEmpty()) {
			System.out.println(p);
			return;
		}
		// intstream - string ke elements ko iterate krne ke liye
		IntStream.range(0, s.length()).forEach(i -> {
			char ch = s.charAt(i);
			String str = s.substring(0, i) + s.substring(i+1);
//			System.out.println(ch + ", " + str);
			permutations(str, p+ch);  //recursion 
		}
		);
		
		
	}
	
	public static void main(String[] args) {
		String s = "abc";
		permutations(s, "");

	}
}
