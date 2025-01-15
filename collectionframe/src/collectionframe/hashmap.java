package collectionframe;
import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = new HashMap<>();
		m.put(5, "Five");
		m.put(8, "Eight");
		m.put(6, "Six");
		m.put(4, "Four");
		m.put(2, "Two");

		// Retrieving
		System.out.println(m.get(6));
		System.out.println();

		// Lambda forEach
		m.forEach((key, value) -> {
		    String msg = key + ": " + value;
		    System.out.println(msg);
		});

	}

}
