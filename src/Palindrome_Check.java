
public class Palindrome_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isPalindrome(String str) {
		char[] char_array = str.toCharArray();
		int i = 0;
		int j = char_array.length -1;
		while(i<j) {
			if(char_array[i]!=char_array[j]) {
				return false;
			}
		}
		return true;
	}

}
