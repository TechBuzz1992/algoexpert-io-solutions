
public class Run_Length_Encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAAABBCCDEEE";
		System.out.println(runLengthEncoding(str));

	}

	public static String runLengthEncoding(String string) {
		StringBuilder ans = new StringBuilder();
		int currLength = 1;

		for (int i = 1; i < string.length(); i++) {
			char curr = string.charAt(i);
			char prev = string.charAt(i - 1);

			if ((curr != prev) || (currLength == 9)) {

				ans.append(Integer.toString(currLength));
				ans.append(prev);
				currLength = 0;

			}
			currLength += 1;
		}
		ans.append(Integer.toString(currLength));
		ans.append(string.charAt(string.length() - 1));

		return ans.toString();
	}

}
