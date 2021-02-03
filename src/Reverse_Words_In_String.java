import java.util.*;

public class Reverse_Words_In_String {

	public String reverseWordsInString(String string) {
		ArrayList<String> words = new ArrayList<String>();
		int startOfWord = 0;

		for (int i = 0; i < string.length(); i++) {
			char character = string.charAt(i);
			if (character == ' ') {
				words.add(string.substring(startOfWord, i));
				startOfWord = i;
			} else if (string.charAt(startOfWord) == ' ') {
				words.add(" ");
				startOfWord = i;
			}
		}
		words.add(string.substring(startOfWord));
		Collections.reverse(words);
		return String.join("", words);
	}
}
