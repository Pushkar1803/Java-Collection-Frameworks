package collectionframe;
import java.util.*;
public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> a = new ArrayDeque<>();

		// Using add()
		a.add("Dog");

		// Using addFirst()
		a.addFirst("Cat");

		// Using addLast()
		a.addLast("Horse");

		// [Cat, Dog, Horse]
		System.out.println(a);

		// Access element
		System.out.println(a.peek());

		// Remove element
		System.out.println(a.pop());

	}

}
