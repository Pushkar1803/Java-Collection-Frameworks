
import java.util.*;
public class anagram {

	 public static boolean areAnagram(String a, String b) {
	        if (a.length() != b.length()) {
	            return false;
	        }
	        char[] str1Array = a.toCharArray();
	        char[] str2Array = b.toCharArray();
	        Arrays.sort(str1Array);
	        Arrays.sort(str2Array);
	        return Arrays.equals(str1Array, str2Array);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hello";

		String b="oleH";
		

   

        if (areAnagram(a, b)) {
            System.out.println("The two strings are anagram of each other");
        } else {
            System.out.println("The two strings are not anagram of each other");
        }
    }
}
