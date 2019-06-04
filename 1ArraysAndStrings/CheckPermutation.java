/**
* Give two strings, write a method to decide if one is a permutation of the other
*
* @version 1.0
*/

//imports

public class CheckPermutation {

	/**
	* O(n)
	*
	* Summary:  Iterate through first string and increment an integer array (size 128 for assumption of 128 non-extended ASCII chars). Loop through the second
	*			string and decrement the integer array. Then check if integer array has non-zero values. If yes they are not permutations. if not then they are permutations.
	*			
	* @param string1 first string to check against
	* @param string2 second string to check against
	* @return 
	*/
	public static void checkPermutation(String string1, String string2) {
		//check if strings are the same length
		if (string1.length() != string2.length()) {
			System.out.println("CAN'T BE! DIFFERENT LENGTHS!");
			return;
		}
		
		int[] characters = new int[128];
		for (char c : string1.toCharArray()) { //loop through string1 and add char count
			characters[(int)c]++;
		}
		
		for (int i=0; i<string2.length(); i++) { //iterate through string2, subtract char count, and check for non-zero value
			characters[string2.charAt(i)]--;
			if (characters[string2.charAt(i)]<0) {
				System.out.println("NOT A PERMUTATION!");
				return;
			}
		}
		System.out.println("Permutations! ;-)");
	}

	public static void main(String[] args) {
		//String string1 = "";
		//String string2 = "";
		
		//String string1 = " ";
		//String string2 = " ";
		
		//String string1 = "  ";
		//String string2 = " ";
		
		String string1 = "racecar";
		String string2 = "acecarr";
		
		//String string1 = "blewdablew";
		//String string2 = "blewdabled";
		
		checkPermutation(string1, string2);
	}
}