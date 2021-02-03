import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "abc";
		String y = "ccb";

		System.out.println(isAnagram(x, y));

	}

	public static boolean isAnagram(String x, String y) {
		if (x.length() != y.length()) {
			return false;
		}
		if (x == null || y == null) {
			return false;
		}
		char[] charX = new char[26];
		char[] charY = new char[26];

		for (int i = 0; i < x.length(); i++) {
			charX[x.charAt(i) - 97]++;
			charY[y.charAt(i) - 97]++;
		}

		for (int i = 0; i < 26; i++) {
			if (charX[i] != charY[i]) {
				return false;
			}
		}
		return true;
	}

	public static List<List<String>> groupAnagrams(List<String> words) {
		Map<String, List<String>> map = new HashMap<>();
		for (String s : words) {
			char[] arr = s.toCharArray();
			Arrays.parallelSort(arr);
			String str = new String(arr);
			if (!map.containsKey(str)) {
				map.put(str, new ArrayList<>());
				map.get(str).add(s);
			} else {
				if (isAnagram(str, s)) {
					map.get(str).add(s);
				}
			}

		}
		List<List<String>> ls = new ArrayList<>();
		for (Map.Entry<String, List<String>> e : map.entrySet()) {
			ls.add(e.getValue());
		}
		return ls;
	}

}
