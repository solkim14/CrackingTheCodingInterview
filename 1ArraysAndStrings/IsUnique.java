/**
* Implement an Algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
*
* @version 1.0
*/

import java.util.Map;
import java.util.HashMap;

public class IsUnique {

	/**
	* O(n) - Character Array Solution
	*
	* Summary:  create a boolean array of 128 chars (assuming non-extended ASCII), iterate through the string, and mark true in boolean array when found
	*			if any value iterated through is true then it is not unique. else IS unique.
	*			
	* @param string the string to check for unique characters
	*/
	public static void isUnique(String string) {
		if (string.length()>128) { //over 128 chars has to have duplicate
			System.out.println("PIGEONHOLE PRINCIPLE FROM THE WOMB TO THE TOMB!!! >8D");
			return;
		}
		
		if (string.length()<=1) { //is unique if 1 or less chars
			System.out.println("So small it's GOTTA be unique B)");
			return;
		}

		boolean[] chars = new boolean[128];
		for (int i=0; i<string.length(); i++) {
			if (chars[string.charAt(i)]) { System.out.println("Not unique :'("); return; }
			else chars[string.charAt(i)]=true;
		}
		System.out.println("It's unique! :D");
	}

	public static void main(String[] args) {
		//String string = "";
		//String string = " ";
		String string = "  ";
		//String string = "racecar";
		//String string = "whoohoo";
		//String string = "brock";
		//String string = "grejkm;grj;wy43qv9rc3U;MW;ACEI;GREA";
		//String string = "AaBbCcDdEeFfGg";
		isUnique(string);
	}
	
	/**
	* O(n) - HashTable Solution
	*
	* Summary:  Add all characters to a hashmap. If the key already exists in the HashMap then it is not made of unique characters
	*			Assuming case matters and that more than 26 letters need to be checked
	*			
	* @param string the string to check for unique characters
	
	public static void isUnique(String string) {
		if (string.length()<=1) { System.out.println("So small it's GOTTA be unique B)"); return; } //is unique if 1 or less chars
		
		Map<Character,Integer> chars = new HashMap<>();
		for (int i=0; i<string.length(); i++) {
			if (chars.containsKey(string.charAt(i))) { System.out.println("Not unique :'("); return; }
			else chars.put(string.charAt(i), 1);
		}
		System.out.println("It's unique! :D");
	}
	*/
}