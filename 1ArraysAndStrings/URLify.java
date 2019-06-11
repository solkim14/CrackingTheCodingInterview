/**
* Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the
* end to hold the additional characters, and that you are given the "true" length of the string. (Note: If implementing in Java,
* please use a character array so taht you can perform this operation in place.)
*
* @version 1.0
*/

//imports

public class URLify {

	/**
	* O(n)
	*
	* Summary:  
	*			
	* @param 
	* @return 
	*/
	public static String replaceSpace(String string, int numChars) {
		if (numChars < 1) return string; //too small
		
		char[] chars = string.toCharArray();
		String stringBuilder = "";
		
		for (int i=0; i<numChars; i++) {
			if (chars[i] == ' ') {
				stringBuilder = stringBuilder + "%20";
			} else {
				stringBuilder = stringBuilder + chars[i];
			}
		}
		return stringBuilder;
	}

	public static void main(String[] args) {
		String string = "Mr John Smith      ";
		int numChars = 13;
		
		System.out.println(replaceSpace(string, numChars));
	}
}