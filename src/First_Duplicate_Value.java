import java.util.*;

public class First_Duplicate_Value {

	public int firstDuplicateValue(int[] array) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (set.contains(array[i])) {
				return array[i];
			} else {
				set.add(array[i]);
			}
		}
		return -1;
	}
}
