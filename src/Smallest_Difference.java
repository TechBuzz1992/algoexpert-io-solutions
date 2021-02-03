import java.util.Arrays;

public class Smallest_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = { -1, 5, 10, 20, 28, 3 };
		int[] arrayTwo = { 26, 134, 135, 15, 17 };
		System.out.println(Arrays.toString(solve(arrayOne, arrayTwo)));

	}

	public static int[] solve(int[] arrayOne, int[] arrayTwo) {
		if (arrayOne.length == 0 || arrayTwo.length == 0 || arrayOne == null || arrayTwo == null) {
			return new int[0];
		}
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int[] ans = new int[2];
		int current = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		int first = 0;
		int second = 0;
		while(i<arrayOne.length && j<arrayTwo.length) {
			first = arrayOne[i];
			second = arrayTwo[j];
			if(first<second) {
				current = second-first;
				i++;
			} else if(second<first) {
				current = first-second;
				j++;
			}else {
				return new int[] {first,second};
			}
			if(smallest>current) {
				smallest = current;
				ans = new int[] {first,second};
			}
		}
		return ans;
	}

}
