package collectionframe;
import java.util.*;
public class hashset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		if (set.isEmpty()) {
		    System.out.println("Empty!");
		}
		System.out.println();

		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("snake");
		set.add("bear");

		if (set.contains("cat")) {
		    System.out.println("Contains cat");
		}
		System.out.println();
		System.out.println(set);
		System.out.println();

		set.remove("cat");
		for (String element : set) {
		    System.out.println(element);
		}

		
		
	}
}
