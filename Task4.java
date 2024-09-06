package LogicBuilding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Task4 {

	public static String stringCompression(String s) {
		String output = "";
		Map<Character, Integer> m = new HashMap<>();
		for(Integer i=0;i<s.length();i++) {
			Character ch = s.charAt(i);	//string se character get krne ke liye
			if(m.containsKey(ch))	
				{System.out.println("ch = " + ch);
				m.put(ch, m.get(ch)+1);}	//map me key and value store krne ke liye
			else
				m.put(ch, 1);
		}
		for(Entry<Character, Integer> e : m.entrySet()) {	//Entry is an interface, maintains a connection to its underlying map if the Entry was obtained by iterating the Map.entrySet view of a map
            output+=e.getKey().charValue() + "" + e.getValue();	//character or uski count ko append krrha hai like a5b1
            System.out.println(e.getKey().charValue());
            System.out.println(e.getValue());
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		System.out.print(stringCompression("aabcccccaaa"));
	        
	}
}
