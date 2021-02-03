import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Move_Element_To_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] int_array = {2, 1, 2, 2, 2, 3, 4, 2};
		List<Integer> array = convertArrayToList(int_array);
		System.out.println(solve(array,2));
	}

	public static List<Integer> solve(List<Integer> array, int toMove) {
		int i = 0;
		int j = array.size()-1;
		while(i<j) {
			while(i<j && array.get(j) == toMove) j--;
			if(array.get(i) == toMove) swap(array,i,j);
			i++;
		}
		return array;

	}

	public static void swap(List<Integer> array, int i, int j) {
		int temp = array.get(j);
		array.set(j, array.get(i));
		array.set(i, temp);

	}
	
	public static <T> List<T> convertArrayToList(T array[]){
		List<T> list = new ArrayList<>();
		Collections.addAll(list, array);
		return list;
	}

}
