package collectionframe;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<>();

		// Adding
		nums.add(2);
		nums.add(5);
		nums.add(8);

		// Retrieving
		System.out.println(nums.get(0));
		
		System.out.println();
		

		// Indexed for loop iteration
		for (int i = 0; i < nums.size(); i++) {
		    System.out.println(nums.get(i));
		}
		System.out.println();

		nums.remove(nums.size() - 1);
		
		System.out.println(nums);
		
		nums.remove(0); // VERY slow

		for (Integer value : nums) {
		    System.out.println(value);
		}

	}

}
