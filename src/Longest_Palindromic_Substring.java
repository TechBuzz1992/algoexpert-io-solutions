
public class Longest_Palindromic_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static String longestPalindromicSubstring(String str) {
		String longest = "";
		for(int i=0;i<str.length();i++) {
			for(int j = i;j<str.length();j++) {
				String subString = str.substring(i, j+1);
				if(subString.length()> longest.length() && isPalindrome(subString)) {
					longest = subString;
				}
				
			}
		}
		return longest;
	}

}
