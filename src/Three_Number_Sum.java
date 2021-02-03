import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Number_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 12, 3, 1, 2, -6, 5, -8, 6 };
		int targetSum = 0;

		List<Integer[]> ans = solve(array, targetSum);
		
		for(Integer[] item : ans) {
			System.out.println(Arrays.toString(item));
		}

	}

	public static List<Integer[]> solve(int[] array, int targetSum) {
		Arrays.parallelSort(array);
		List<Integer[]> ans = new ArrayList<Integer[]>();
		for (int i = 0; i < array.length - 2; i++) {
			int low = i + 1;
			int high = array.length - 1;
			int first = array[i];
			int rem = targetSum - first;
			while (low < high) {
				int second = array[low];
				int third = array[high];
				if (second + third == rem) {
					low++;
					high--;
					ans.add(new Integer[] { first, second, third });
				} else if (second + third < rem) {
					low++;
				} else {
					high--;
				}
			}
		}
		return ans;
	}

}
