package LogicBuilding;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
	
	public static boolean toCheckAnangram(String s1, String s2) {
		/*Boolean temp;
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) 
			temp = true;
		else
			temp = false;
		
		return temp;*/
		
		String s11 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());        

		String s22 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		    if (s11.equals(s22))
		    {
		    	return true;
		    }
		    else
		    {     
		    	return false;
		    }
		
	}
	
public static void main(String[] args) {
	
//	String s1="bored";
//	String s2="robed";
//	
//	if(toCheckAnangram(s1, s2)) 
//		System.out.println("Anangram!");
//	else
//		System.out.println("not anangram!@");
	
	if(toCheckAnangram("listen", "silent"))
		System.out.println("Ana");
	else
		System.out.println("not ana");
}
}
