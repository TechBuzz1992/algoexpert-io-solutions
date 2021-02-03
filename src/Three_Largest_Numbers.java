import java.util.Arrays;

public class Three_Largest_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] threeLargestNumbers(int[] array) {
		Arrays.parallelSort(array);
		int len = array.length;
		return new int[] {array[len-3], array[len-2], array[len-1]};
	}

}
