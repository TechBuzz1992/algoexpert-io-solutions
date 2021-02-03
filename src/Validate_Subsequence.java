import java.util.*;

public class Validate_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] int_array = {1,2,3,4,5,6,7,8,9,10};
		Integer[] int_sequence = {2,4,6,7,8,12};
		List<Integer> array = convertArrayToList(int_array);
		List<Integer> sequence = convertArrayToList(int_sequence);
		System.out.println(solve(array, sequence));
		
	}
	
	public static <T> List<T> convertArrayToList(T array[]){
		List<T> list = new ArrayList<>();
		Collections.addAll(list, array);
		return list;
	}
	
	public static boolean solve(List<Integer> array, List<Integer> sequence) {
		int i = 0;
		int j = 0;
		while(i<array.size() && j<sequence.size()) {
			if(array.get(i) == sequence.get(j)) {
				i++;
				j++;
			} else {
				i++;
			}
		}
		if(j == sequence.size()) {
			return true;
		}
		else {
			return false;
		}
	}

}
